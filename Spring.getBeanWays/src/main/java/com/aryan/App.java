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
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Alien a1= context.getBean("alien",Alien.class); //method 1 name + class
        a1.start();
        Desktop d= context.getBean(Desktop.class);          //method 2 only class but in spring.xml also only class should be mentioned and not id
        d.compile();
        Computer c=context.getBean(Computer.class);        //method 3 when you have interface i.e computer implemented by both laptop and desktop both
                                                           // so both are of same type so spring gets confused kiska object banao
                                                           //isleye it is better to mentioned name/id of class whos object is needed in these situation or use primary="true" keyword in spring.xml
        c.compile();
    }
}
