package mbronshteyn.spring.cloud.function.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBeanInjection {

    @Autowired
    String a;

    @Autowired
    String b;

    @Autowired
    String c;

    @Test
    void testBeanInjection() {
        System.out.println("Testing autoinjection: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


