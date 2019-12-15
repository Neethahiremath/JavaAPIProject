package com.sample.service.coffeemachine.model;

public class ItemDetails {

  private CoffeeItems coffeeItems;
  private Double price;
  private Integer capacity;

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public ItemDetails(CoffeeItems coffeeItems, Double price, Integer capacity) {
    this.coffeeItems = coffeeItems;
    this.price = price;
    this.capacity = capacity;
  }

  public CoffeeItems getCoffeeItems() {
    return coffeeItems;
  }

  public void setCoffeeItems(CoffeeItems coffeeItems) {
    this.coffeeItems = coffeeItems;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
