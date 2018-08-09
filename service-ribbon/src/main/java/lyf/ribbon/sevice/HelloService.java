package lyf.ribbon.sevice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: liyufeng
 * @Description:
 * @Date: Created in 上午10:51 18-8-9
 * @Modified By:
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return  restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name , String.class);
    }

    public String hiError (String name) {

        return "hi,"+name+",sorry,error!";
    }
}
