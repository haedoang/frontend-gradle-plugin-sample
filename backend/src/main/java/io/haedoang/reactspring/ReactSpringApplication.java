package io.haedoang.reactspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class ReactSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactSpringApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

}
