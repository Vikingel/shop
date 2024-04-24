package Vikingel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Scanner;

@Component
public class ProductService {
    ArrayList<Product> prdsList = new ArrayList<Product>();

    public ProductService() {

        prdsList.add(new Product(1001, "milk", 80));
        prdsList.add(new Product(2002, "meat", 400));
        prdsList.add(new Product(3003, "bread", 50));
    }

    public void showPrds() {
        System.out.println(prdsList);
    }

    public void findPrds() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово для поиска");
        String prdF = scan.next();
        for (Product p : prdsList) {
            if ((p.name).contains(prdF)) {
                System.out.println(p);
            }
        }
    }
}


