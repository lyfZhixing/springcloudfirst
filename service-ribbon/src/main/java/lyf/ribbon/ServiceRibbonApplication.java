package lyf.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: liyufeng
 * @Description: 通过@EnableDiscoveryClient向服务中心注册
 * @Date: Created in 上午10:44 18-8-9
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceRibbonApplication.class , args );
    }

    /**
     * 并且向程序的ioc注入一个bean: restTemplate;
     * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate () {
        return new RestTemplate();
    }
}
