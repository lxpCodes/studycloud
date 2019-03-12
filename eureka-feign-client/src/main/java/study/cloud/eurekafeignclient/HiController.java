package study.cloud.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By tudou On 2018/5/28
 */
@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(defaultValue = "liangxp", required = false) String name) {
        return hiService.sayHi(name);
    }
}
