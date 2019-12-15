package com.sample.service.coffeemachine.model.service;

import com.sample.service.coffeemachine.model.CoffeeItems;
import com.sample.service.coffeemachine.model.ItemDetails;

public class CoffeeService {

  private CoffeeItems coffeeItems;

  public Double getBalanceMoney(Double price)
      throws IllegalArgumentException {

    Double balance;
    ItemDetails itemDetails = ItemService.getPriceFromItem(coffeeItems);

    if (price < itemDetails.getPrice()) {
      throw new IllegalArgumentException("Input value lesser than expected");
    } else {
      balance = price - itemDetails.getPrice();
    }
    dispense(itemDetails);
    return balance;
  }

  public boolean isEmpty(ItemDetails itemDetails) {
    return itemDetails.getCapacity() < 0;
  }

  public void dispense(ItemDetails itemDetails) {
    if (isEmpty(itemDetails)) {
      refill(itemDetails);
    }
    itemDetails.setCapacity(itemDetails.getCapacity() - 2);
  }

  public void refill(ItemDetails itemDetails) {
    itemDetails.setCapacity(10);
  }

  public void getCoffeeSelection(CoffeeItems coffeeItems) {
    this.coffeeItems = coffeeItems;
  }

}
