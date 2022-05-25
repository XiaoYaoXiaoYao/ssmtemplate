package cn.xiaoyao.ssm.config.beanFactoryPostProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author xiaoyao
 * @date 2022/5/20
 */
public class MyBeanFactoryPostProcesser extends PropertySourcesPlaceholderConfigurer {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("进行user的实例化之前的操作");
        BeanDefinition user = beanFactory.getBeanDefinition("user");
        user.getPropertyValues().addPropertyValue(new PropertyValue("address", "南京"));
        super.postProcessBeanFactory(beanFactory);
    }
}
