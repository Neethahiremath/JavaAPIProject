package com.sample.service.coffeemachine.model;

import com.sample.service.coffeemachine.model.service.CoffeeService;
import java.util.Scanner;

public class CoffeeWending {

  public static void main(String[] args) {

    CoffeeService coffeeService = new CoffeeService();

    System.out.printf("Make the Coffee Selection");

    System.out.printf(" BLACK,\n"
        + "  CREAM,\n"
        + "  SUGAR,\n"
        + "  CREAM_SUGAR");

    Scanner scanner = new Scanner(System.in);

    String inputCoffee = scanner.next();

    System.out.printf("Provide the Money");
    double price = scanner.nextDouble();

    CoffeeItems coffeeItems = CoffeeItems.valueOf(inputCoffee);

    Double balanceMoney = coffeeService.getBalanceMoney(price);

    System.out.print(balanceMoney);

  }

}
