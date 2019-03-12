package study.cloud.eurekafeignclient;

import org.springframework.stereotype.Component;

/**
 * Created By tudou On 2018/5/28
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ", sorry,error!";
    }
}
