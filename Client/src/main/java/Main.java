import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mvc.xml");

        UserService userService=applicationContext.getBean("userService",UserService.class);
        User user=new User();
        user.setUserName("shimaa");
        user.setSalary(155);
        user.setBonus(5);
        user.setDeduction(12);
        System.out.println(userService.getNetSalary(user));

    }
}
