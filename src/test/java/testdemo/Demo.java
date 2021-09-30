package testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void test1() {

        ApplicationContext ac = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("hello");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }



    }
}
