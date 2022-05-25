package testdemo;

import cn.xiaoyao.ssm.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {


    /**
     * bean的生命周期
     * 1.读取xml,根据xml获取bean的定义map
     * 2.实例化之前的操作 BeanFactoryPostProcesser中的postProcessBeanFactory()方法
     * 3.进行属性的填充populateBean()方法
     * 4.初始化之前调用Aware中的方法  exposedObject = initializeBean(beanName, exposedObject, mbd)中调用实现了Aware接口的Bean进行特定的方法  譬如setBeanName()方法
     * 5.调用BeanPostProcesser中的初始化之前的方法postProcessBeforeInitialization()
     * 6.调用实现了InitializingBean接口的初始化方法afterPropertiesSet()
     * 7.调用bean配置的init-method的初始化方法 init-method
     * 8.调用实现了InitializingBean接口的初始化方法postProcessAfterInitialization()
     * 9.bean的调用
     * 10.bean的销毁
     */
    @Test
    public void test1() {

        ApplicationContext ac = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        User userBean = ac.getBean("user", User.class);
        System.out.println("user的name:"+userBean.getUserName()+"-->其中的user的name是通过BeanFactoryPostProcesser来实现的 ${my.name}");  //其中的user的name是通过BeanFactoryPostProcesser来实现的
        System.out.println(userBean.getSex());
        System.out.println(userBean.getAddress());



    }
}
