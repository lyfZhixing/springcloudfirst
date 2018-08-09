package lyf.ribbon.sevice;

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

    public String hiService(String name) {
        return  restTemplate.getForObject("http://SERVICEHI/hi?name=" + name , String.class);
    }
}
