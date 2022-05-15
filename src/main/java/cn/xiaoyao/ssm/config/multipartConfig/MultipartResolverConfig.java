package cn.xiaoyao.ssm.config.multipartConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @author xiaoyao
 * @date 2022/5/15
 */
@Component
public class MultipartResolverConfig  {

    @Bean
    CommonsMultipartResolver  multipartResolver(){
        return new CommonsMultipartResolver();
    }
}
