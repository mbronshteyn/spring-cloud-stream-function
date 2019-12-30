package mbronshteyn.spring.cloud.function.demo;

import lombok.Data;
import lombok.ToString;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
@Log
public class DemoApplication {

  public static void main(String[] args) {

    SpringApplication.run(DemoApplication.class, "--spring.cloud.function.routing-expression="
      + "T(java.lang.System).nanoTime() % 2 == 0 ? 'even' : 'odd'");

  }

  @Bean
  public Function<String, String> uppercase() {
    return value -> {
      log.info("Uppercasing: " + value);
      return value.toUpperCase();
    };
  }

  @Bean
  public Consumer<String> even() {
    return value -> System.out.println("EVEN: " + value);
  }

  @Bean
  public Consumer<String> odd() {
    return value -> System.out.println("ODD: " + value);
  }

  @Bean
  public Supplier<String> message() {
    return () -> "Test Message";
  }

  @Bean
  public Consumer<Person> personLog() {
    return person -> {
      System.out.println("Received: " + person);
    };
  }

  @Data
  @ToString
  public static class Person {
    private String name;
  }
}
