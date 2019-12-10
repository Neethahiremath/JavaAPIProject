package com.sample.service.JavaPrograms;

import java.util.Arrays;

public class AddTwoSinglyLinkedList {

  public Node addTwoNumbers(Node l1, Node l2) {

    int rev2=0;
    int rev=0;
    while(l1!=null)
    {

      rev= rev*10+ l1.data;
      l1=l1.next;

    }

    while(l2!=null)
    {
      rev2= rev2*10+l2.data;
      l2=l2.next;
    }

    int l1Rev= reverse(rev);
    int l2Rev = reverse(rev2);

    int sum = l1Rev + l2Rev;

    return push((sum));

  }

  private Node push(int num)
  {
    Node dummy= new Node(0);
    Node curr = dummy;

    int  digit=0;
    while(num!=0)
    {
      digit = num%10;
      curr.next = new Node(digit);
      num=num/10;
    curr=curr.next;
    }
    return dummy.next;

  }
  private int reverse(int num)
  {
    int reverse=0;
    int  digit=0;
    while(num!=0)
    {
      digit = num%10;
      reverse= reverse *10+digit;
      num=num/10;
    }

    return reverse;
  }


  public static void main(String[] args) {
    Node n = new Node(2);
    n.next = new Node(4);
    n.next.next = new Node(3);

    Node n1 = new Node(5);
    n1.next = new Node(6);
    n1.next.next = new Node(4);

    AddTwoSinglyLinkedList obj = new AddTwoSinglyLinkedList();
    Node node = obj.addTwoNumbers(n, n1);
  }
}
