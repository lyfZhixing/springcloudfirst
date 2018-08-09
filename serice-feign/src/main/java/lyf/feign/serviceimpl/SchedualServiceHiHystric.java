package lyf.feign.serviceimpl;

import lyf.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author: liyufeng
 * @Description: 断路器，断路时运行
 * @Date: Created in 下午5:48 18-8-9
 * @Modified By:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
