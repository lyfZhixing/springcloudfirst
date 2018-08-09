package lyf.feign.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: liyufeng
 * @Description:
 * @Date: Created in 下午4:59 18-8-9
 * @Modified By:
 */
@FeignClient(value = "servicehi")
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam( value = "name" , defaultValue = "lyf") String name);

}
