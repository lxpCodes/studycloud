package study.cloud.eurekaribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "study.cloud")
@EnableHystrix
@EnableHystrixDashboard
public class EurekaRibbonClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaRibbonClientApplication.class, args);
    }
}
