package ie.atu.week5blocking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week5BlockingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week5BlockingApplication.class, args);
    }

}
