package com.sample.service.JavaPrograms;

public class GuessOutput {

  static bvb obj = new bvb(10);
  bvb obj3 = new bvb(9);
  GuessOutput()
  {
    System.out.printf("hi");

  }
}

class abc extends GuessOutput{

  static bvb obj = new bvb(10);

  abc()
  {
    System.out.printf("super");
  }
}

 class bvb{
  bvb(int i){
    System.out.println("hhh" +i);
  }

  public static void main(String[] args) {

    abc obj = new abc();
  }
}

//static
//non block
//constructor