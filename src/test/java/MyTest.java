import com.lv.pojo.Books;
import com.lv.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project ：SpringMVC-SSM-Build
 * @IDE ：IntelliJ IDEA
 * @Author ：Levi_Bee
 * @Date ：2021/12/23 1:54 下午
 */


public class MyTest {
    @Test
    public void test01() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = context.getBean("bookServiceImpl", BookService.class);
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }
}
