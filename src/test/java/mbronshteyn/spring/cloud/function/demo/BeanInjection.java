package mbronshteyn.spring.cloud.function.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInjection {

    @Bean
    public String a() {
        return "A";
    }

    @Bean
    public String b() {
        return "B";
    }

    @Bean
    public String c(String a, String b) {
        return a + " ... " + b;
    }
}
