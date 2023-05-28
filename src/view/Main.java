package view;

import common.StaticScanner;
import controler.LaptopControler;
import model.entity.Laptop;
import model.repository.LaptopDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopControler laptopControler = new LaptopControler();
        Laptop laptop = new Laptop();

        Scanner input = StaticScanner.getData();

        int requsetForInsert;

        for (; ; ) {
            System.out.println("1.insert");
            requsetForInsert = input.nextInt();
            switch (requsetForInsert) {
                case 1 -> {
                    laptop.setLaptopName(input.nextLine());
                    laptopControler.sendDataToService(laptop);
                }
            }
        }
    }
}
