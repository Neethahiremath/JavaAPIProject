package com.sample.service.JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class HashMapImplementation {

    class Holder {
        private Object key;
        private Object value;

        Holder(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<Holder> holderList;

    HashMapImplementation() {
        this.holderList = new ArrayList<>();
    }

    public void put(Object key, Object value) {
        Holder holder = new Holder(key, value);

        for (Holder item : holderList) {
            if (item.key.equals(key)) {
                holderList.remove(item);
                break;
            }
        }
        holderList.add(holder);
    }

    public Object get(Object key)
    {
        for (Holder item : holderList)
        {
            if(item.key.equals(key))
                return item.value;
        }
        return null;
    }

    public Object remove(Object key)
    {
        for (Holder item : holderList)
        {
            if(item.key.equals(key))
                holderList.remove(item);
                return item.value;
        }
        return null;
    }

    public Object replace(Object key,Object value)
    {
        for (Holder item : holderList)
        {
            if(item.key.equals(key))
                item.value=value;
            return item.value;
        }
        return null;
    }



    public static void main(String[] args) {

        HashMapImplementation hashMapImplementation = new HashMapImplementation();
        hashMapImplementation.put(1,"hi");
        hashMapImplementation.put(2,"hello");
        hashMapImplementation.put(3,"hihello");
        System.out.println(hashMapImplementation.get(1));
        System.out.println(hashMapImplementation.get(2));
        System.out.println(hashMapImplementation.get(3));
        hashMapImplementation.put(2,"neet");
        System.out.println(hashMapImplementation.get(2));
        System.out.println(hashMapImplementation.get(10));
        System.out.println(hashMapImplementation.remove(1));
        System.out.println(hashMapImplementation.replace(3,"pooji"));
        System.out.println(hashMapImplementation.get(3));

    }
}
