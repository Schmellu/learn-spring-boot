package linkedin.boot;

import org.springframework.stereotype.Service;

//Interface Implementierung
@Service
public class HelloService implements GreetingService {

public String hello() {
  return "Hello, more testing";
}
  
}
