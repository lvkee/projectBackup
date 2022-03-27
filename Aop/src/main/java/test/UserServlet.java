package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/adduser")
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        System.out.println(name);
        System.out.println(age);
        //创建spring容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        UserService userService=ctx.getBean(UserService.class);

        //中文
        resp.setContentType("text/html; charset=utf-8");
        //1.获取字符输出流
        PrintWriter writer = resp.getWriter();
        try {
            userService.addUser(new User(name, Integer.parseInt(age)));
            writer.write("<h1>添加成功</h1>");
        }catch (Throwable ex){
            writer.write("<h1>失败，未成年禁止添加</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //因为处理逻辑都是一样的，这样可以防止冗余
        this.doGet(req,resp);
    }
}
