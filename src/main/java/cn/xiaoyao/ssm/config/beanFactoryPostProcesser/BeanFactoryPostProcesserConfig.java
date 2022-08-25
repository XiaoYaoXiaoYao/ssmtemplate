package cn.xiaoyao.ssm.config.beanFactoryPostProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Date;

/**
 *可能注解方式注册  在test中的ApplicationContent获取目前是失效的
 */
//@Component
public class BeanFactoryPostProcesserConfig extends PropertySourcesPlaceholderConfigurer {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("这个是user的bean实例化之前的操作");
        BeanDefinition userBeanDefinition = beanFactory.getBeanDefinition("user");
        MutablePropertyValues propertyValues = userBeanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("birthday", new Date()));

        super.postProcessBeanFactory(beanFactory); //父类中替换模板字段中的方法

    }


    /**
     * 这个还有问题  为什么在javabean中定义了location没有生效 必须要是xml中配置location才能生效 ?????????????
     * @param location
     */
    @Override
    public void setLocation(Resource location) {
        location = new ClassPathResource("resource.properties");
        super.setLocation(location);
    }
}
