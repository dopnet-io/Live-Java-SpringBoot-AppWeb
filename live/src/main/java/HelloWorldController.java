import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RESTController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class HelloController {
 
    @GetMapping()
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    }  
}
