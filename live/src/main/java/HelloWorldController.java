import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RESTController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
 
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    }  
}
