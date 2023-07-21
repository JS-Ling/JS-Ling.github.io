import com.sun.glass.ui.Application;
import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

public class run2 {
    public static void main(String[] args) {
//        3.获取IoC容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

//        4.获取bean
        BookDao bookDao=(BookDao) ctx.getBean("bookDao");
        bookDao.save();

        BookService bookService=(BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
