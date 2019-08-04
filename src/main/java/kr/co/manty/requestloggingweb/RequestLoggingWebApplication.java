package kr.co.manty.requestloggingweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;


@RestController
@SpringBootApplication
public class RequestLoggingWebApplication {
    
    private static final Logger log = LoggerFactory.getLogger(RequestLoggingWebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RequestLoggingWebApplication.class, args);
    }
    

    @RequestMapping("/")
    public String anything(@RequestBody  String request) throws IOException {
        log.error(request);
        return "success";
    }

}
