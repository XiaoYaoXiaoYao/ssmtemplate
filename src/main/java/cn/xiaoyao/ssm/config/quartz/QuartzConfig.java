package cn.xiaoyao.ssm.config.quartz;

import com.alibaba.druid.pool.DruidDataSource;
import org.quartz.Scheduler;
import org.quartz.simpl.SimpleJobFactory;
import org.quartz.spi.JobFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springmore.core.datasource.DynamicDataSource;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Properties;

/**
 * @author xiaoyao
 * @date 2022/4/23
 */
//@Configuration
public class QuartzConfig {

    @Autowired
    private DynamicDataSource dataSource;


    @Resource
    private JobFactory jobFactory;


    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() throws IOException {
        //获取配置属性
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
        //在quartz.properties中的属性被读取并注入后在初始化对象
        propertiesFactoryBean.afterPropertiesSet();

        //创建SchedulerFactoryBean
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        Properties properties = propertiesFactoryBean.getObject();
        //覆盖已存在的任务
        factory.setOverwriteExistingJobs(true);
        //设置Scheduler自动启动
        factory.setAutoStartup(true);
        //设置延迟10s启动
        factory.setStartupDelay(10);
        if (properties != null) {
            factory.setQuartzProperties(properties);
        }
        factory.setJobFactory(jobFactory);
        factory.setDataSource(dataSource);
        return factory;

    }

    @Bean
    public Scheduler scheduler() throws IOException {
        return schedulerFactoryBean().getScheduler();
    }

    @Bean
    public SimpleJobFactory simpleJobFactory() {
        return new SimpleJobFactory();
    }



}
