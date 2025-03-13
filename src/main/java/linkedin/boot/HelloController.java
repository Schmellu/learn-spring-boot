package linkedin.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  //Abhängigkeit auf Interface
  private HelloService service;

  //Konstruktor-Injection
  //public HelloController(HelloService service) {
  //  this.service = service;
  //}

  @GetMapping("/")
  public String get() {
    return this.service.hello();
  }
}