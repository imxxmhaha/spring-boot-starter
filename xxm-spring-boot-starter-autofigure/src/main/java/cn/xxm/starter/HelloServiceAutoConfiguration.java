package cn.xxm.starter;

import cn.xxm.starter.aop.LoggerAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xxm
 * @create 2019-11-02 22:43
 */
@Configuration
@ConditionalOnWebApplication  // WEB应用才生效
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    //@Autowired
    //private HelloProperties helloProperties;

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        //helloService.setHelloProperties(helloProperties);
        return helloService;
    }

    //@Bean
    //public LoggerAdvice loggerAdvice(){
    //    return new LoggerAdvice();
    //}
}
