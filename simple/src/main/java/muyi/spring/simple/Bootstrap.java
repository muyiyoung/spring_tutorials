package muyi.spring.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Jimu Yang
 * @date: 2018/11/25 1:51 PM
 * @descricption: want more.
 */
public class Bootstrap {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        

    }
}
