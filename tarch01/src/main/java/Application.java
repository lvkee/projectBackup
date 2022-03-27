/*
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.User;
import test.UserService;

*/
/**
 * aop测试程序
 *//*

public class Application {
    public static void main(String[] args) {
        //创建spring容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

        // 测试用户服务aop过程

        UserService userService=ctx.getBean(UserService.class);//获取注入的bean对象
        User user = new User("Bob",16);

        userService.addUser(user);
        System.out.println("======================================================================");
        userService.deleteUser(user);

        ctx.close();
    }
}
*/
