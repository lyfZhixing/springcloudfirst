package lyf.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lyf.ribbon.sevice.HelloService;

/**
 * @Author: liyufeng
 * @Description:
 * @Date: Created in 上午10:54 18-8-9
 * @Modified By:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam(value = "name" , defaultValue = "lyf/ribbon") String name) {
        return helloService.hiService( name );
    }
}
