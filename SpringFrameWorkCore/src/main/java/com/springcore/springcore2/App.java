package com.springcore.springcore2;
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
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
   
BulbService bs1=(BulbService)applicationContext.getBean("bs");
System.out.println(bs1.askBulb);
    }
}
