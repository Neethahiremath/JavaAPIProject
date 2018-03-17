package com.sample.service.JavaPrograms;

public class IntializeOnlyTwoInstance {

    static int objectCount = 0;
    String name;

    IntializeOnlyTwoInstance() throws Exception {
        objectCount++;
        name = getClass().getName();
        if (objectCount > 2) {
            throw new Exception("Can not craete more than 2");
        }
    }

    public static void main(String[] args) {

        try {
            IntializeOnlyTwoInstance obj = new IntializeOnlyTwoInstance();
            System.out.println(obj.name);
            IntializeOnlyTwoInstance secondCall = new IntializeOnlyTwoInstance();
            IntializeOnlyTwoInstance three = new IntializeOnlyTwoInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(IntializeOnlyTwoInstance.objectCount);
    }
}
