package study.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.cloud.service.RibbonService;

/**
 * Created By tudou On 2018/5/25
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "Liangxp") String name) {
        return ribbonService.hi(name);
    }

    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance instance = loadBalancerClient.choose("eureka-client1");
        return instance.getHost() + ":" + instance.getPort();
    }

}
