package com.aryan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Alien a1=(Alien)context.getBean("alien");
        System.out.println(a1.getAge());

        Alien a2=(Alien)context.getBean("alien");
        System.out.println(a1.getAge());


    }
}
//abhe ye samjo setter injection hota kya hai
//see spring mai apan injection use karte hai to inject objects values called dependency injection
//consider karo ki aaise situation hai jisme tuzhe by default ek value set karni hoo ek variable ki
//eg. age
//abhe ye age private variable hai toh setter lagega and getter bhi isleye setter getter bana diya
//abh tu humesha thodi a1.setage() karega usse accha make a property in spring.xml
//    <bean id="alien" class="com.aryan.Alien" >
//    <property name="age" value="21"> </property>
//    </bean>
// abhe ye property dekho abh jab jab alien ka koi bhi object create hoga uska age 21 hoga
//isme kya ho raha hai Spring->check xml-> create object-> set variable value as mentioned in property by using setter
//thus these is called setter injection aaisa hota hai ye sabh
//no matter single object bane or prototype use karo ye set kar dega for multiple object of alien

