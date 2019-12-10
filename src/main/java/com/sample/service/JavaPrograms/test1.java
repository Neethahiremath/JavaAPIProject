package com.sample.service.JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class test1 {

  public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();

    for(int i=0;i<nums.length-1;i++)

    {
      HashSet<Integer> store = new HashSet<>();
      AtomicBoolean found = new AtomicBoolean(false);
      for(int j=i+1;j<nums.length;j++)
      {

        int val = -(nums[i] + nums[j]);

        if(store.contains(val))
        {
          List<Integer> r = new ArrayList<>();
          r.add(nums[i]);
          r.add(val);
          r.add(nums[j]);

          if(result.isEmpty())
            result.add(r);

          result.forEach(r1->{

            if(r1.containsAll(r)) {
              found.set(true);
            }
          });

          if(found.get()!=true)

            result.add(r);



        }
        else
        {
          store.add(nums[j]);
        }
      }


    }
    return result;
  }

  public static void main(String[] args) {

    test1 o = new test1();
    o.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

  }
}


