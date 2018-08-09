package lyf.feign.controller;

import lyf.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liyufeng
 * @Description:
 * @Date: Created in 下午5:03 18-8-9
 * @Modified By:
 */
@RestController
public class HiController {

    /**
     * 编译器报错，无视。因为这个bean是在程序启动的时候注入的，编译器无法感知，所以报错
     */
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }

}
