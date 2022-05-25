package cn.xiaoyao.ssm.config.beanPostProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author xiaoyao
 * @date 2022/5/20
 */
public class MyBeanPostProcesser  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("user".equals(beanName)) {
            System.out.println("user的初始化之前的操作");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("user".equals(beanName)) {
            System.out.println("user的初始化之后的操作");
        }
        return bean;
    }
}
