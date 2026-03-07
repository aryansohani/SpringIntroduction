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
        Alien a1= (Alien) context.getBean("alien1");
        a1.age=21;
        System.out.println(a1.age);

        Alien a2= (Alien) context.getBean("alien1");
        System.out.println(a2.age);

        System.out.println("in above example the a1 and a2 are refering to same object so the answer is 21,21 ");

        Laptop lap1=(Laptop) context.getBean("laptop");
        lap1.price=1000;
        System.out.println(lap1.price);

        Laptop lap2=(Laptop) context.getBean("laptop");
        System.out.println(lap2.price);

        System.out.println("in above example the scope = prototype so whenever we call .getbean() new object is created so lap 1 and lap2 are different objects");


    }
}
//Dekho in Spring there are multiple scopes
//eg.singleton,prototype,session etc
//by default singleton hota hai means when ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
//ye use karte hai tab woh object bana deta hai using xml and .getbean() se wohi object call hota and new object create nhi hote
//a1=a2=same object

//on other hand
// jab hum scope define karte hai as prototype in xml tab spring by default object nahi banata apan jab .getbean() karte hai tab woh
//object banata hai eg. .getbean() 10 times= 10 objects
//lap1=object 1 lap2=object 2