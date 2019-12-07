package mbronshteyn.spring.cloud.function.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, "--spring.cloud.function.routing-expression="
      + "T(java.lang.System).nanoTime() % 2 == 0 ? 'even' : 'odd'");
  }

  @Bean
  public Consumer<String> even() {
    return value -> System.out.println("EVEN: " + value);
  }

  @Bean
  public Consumer<String> odd() {
    return value -> System.out.println("ODD: " + value);
  }
}
