import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

     @GetMapping("/curintia")
     public String hello() {
         return "Vai Corinthians!";
     }
}
