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
            System.out.println("2.search");
            requsetForInsert = input.nextInt();
            input.nextLine();
            switch (requsetForInsert) {
                case 1 -> {
                    System.out.print("insert laptop name: ");
                    laptop.setLaptopName(input.nextLine());

                    System.out.print("insert id: ");
                    laptop.setId(input.nextLong());

                    laptopControler.sendDataToService(laptop);
                }
                case 2 -> {
                    System.out.print("insert id for search: ");
                    if (! laptopControler.sendIdToServiceForSearch(input.nextLong()).equals(null))
                        System.out.println("found");
                    else System.out.println("not found");

                }
            }
        }
    }
}
