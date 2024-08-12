package com.springcore;

/**
 * Hello world!
 *
 */
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("applicationContext.xml");  
 Employee empl=(Employee)applicationContext1.getBean("emp");
 System.out.println(empl);
    }
}
