package Vikingel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
    @Bean(name = "productServiceBest")
    public ProductService productServiceBest() {
        return new ProductService();
    }
}
