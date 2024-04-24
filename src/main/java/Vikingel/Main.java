package Vikingel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
example1();
    }

    private static void example1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService p1= context.getBean("productServiceBest", ProductService.class);
        p1.showPrds();
        p1.findPrds();
            }
}