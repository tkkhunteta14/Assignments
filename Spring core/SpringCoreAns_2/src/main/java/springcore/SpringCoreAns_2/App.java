package springcore.SpringCoreAns_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Question obj = (Question)context.getBean("question");
    	System.out.println(obj);
    }
}
