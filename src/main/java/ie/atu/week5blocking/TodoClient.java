package ie.atu.week5blocking;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jsonPlaceHolder", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {
    @GetMapping("/todos/1")
    TodoResponse fetchData();
}
