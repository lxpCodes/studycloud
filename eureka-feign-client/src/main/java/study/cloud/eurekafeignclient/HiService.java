package study.cloud.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By tudou On 2018/5/28
 */
@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {

        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
