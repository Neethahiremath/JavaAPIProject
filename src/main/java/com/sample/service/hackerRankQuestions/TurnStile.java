package com.sample.service.hackerRankQuestions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TurnStile {

  public static List<Integer> getTimes(List<Integer> time, List<Integer> direction) {

    int timer = 0, i = 0;
    boolean used = false, out = true;

    int[] result = new int[time.size()];

    Queue<Integer> iq = new LinkedList();
    Queue<Integer> oq = new LinkedList();

    while (i < time.size() || !iq.isEmpty() || !oq.isEmpty()){

      while (i < time.size() && timer == time.get(i)){

        if (direction.get(i) == 0){
          iq.add(i);
        }else{
          oq.add(i);
        }
        i++;
      }

      if (!iq.isEmpty() || !oq.isEmpty()){

        if (!used){

          if (!oq.isEmpty()){
            result[oq.poll()] = timer;
            out = true;
          }else{
            result[iq.poll()] = timer;
            out = false;
          }
          used = true;

        }else{

          if (out && !oq.isEmpty()){
            result[oq.poll()] = timer;
            out = true;
          }else{
            result[iq.poll()] = timer;
            out = false;
          }
        }
      }else{

        used = false;
      }

      timer++;
    }

    return IntStream.of(result)
        .boxed()
        .collect(Collectors.toList());

  }
}
