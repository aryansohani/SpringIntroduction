package com.aryan;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Alien a1= context.getBean("alien", Alien.class);
        a1.start();
        Laptop l2=context.getBean("Lap",Laptop.class);
        l2.compile();

    }
}
