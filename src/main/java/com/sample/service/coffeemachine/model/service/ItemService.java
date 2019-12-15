package com.sample.service.coffeemachine.model.service;

import com.sample.service.coffeemachine.model.CoffeeItems;
import com.sample.service.coffeemachine.model.ItemDetails;
import java.util.ArrayList;
import java.util.List;

public class ItemService {

  private static List<ItemDetails> itemDetails = new ArrayList<>();

  public static List<ItemDetails> getItemValues() {

    itemDetails.add(new ItemDetails(CoffeeItems.BLACK, 0.35,10));
    itemDetails.add(new ItemDetails(CoffeeItems.CREAM, 0.35,10));
    itemDetails.add(new ItemDetails(CoffeeItems.SUGAR, 0.35,10));
    itemDetails.add(new ItemDetails(CoffeeItems.CREAM_SUGAR, 0.6,10));

    return itemDetails;

  }

  public static ItemDetails getPriceFromItem(CoffeeItems coffeeItems) {
    return ItemService.getItemValues().stream()
        .filter(x -> x.getCoffeeItems().equals(coffeeItems)).findFirst().get();
  }

}
