package day1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {

	 public static void main(String[] args) {
         // TODO Auto-generated method stub
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo1.xml");
         System.out.println("----------------Context Loaded ---------------");
         Demo1 s1 = context.getBean("s1", Demo1.class);
         s1.m1();
         Demo1 s2 = context.getBean("s1", Demo1.class);
         s2.m1();
         Demo1 s3 = context.getBean("s1", Demo1.class);
         s3.m1();
     }


}
