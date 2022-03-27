package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/adduser")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = ctx.getBean(UserService.class);
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter writer = resp.getWriter();
        try {
            userService.addUser(new User(username, password));
            writer.write("<h1>添加成功</h1>");
        } catch (Throwable ex) {
            writer.write("<h1>失败，用户已加入黑名单</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //因为处理逻辑都是一样的，这样可以防止冗余
        this.doGet(req, resp);
    }
}
