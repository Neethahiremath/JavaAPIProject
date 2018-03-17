package com.sample.service.JavaPrograms;

import java.util.Collections;
import java.util.Objects;

public class HashAndEqual {
    
    private Integer a;
    private String b;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HashAndEqual that = (HashAndEqual) o;
        return Objects.equals(a, that.a) &&
               Objects.equals(b, that.b);
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b);
    }

    public static void main(String[] args) {

        boolean equals = new HashAndEqual().equals(new HashAndEqual());
        System.out.println(equals);
    }
}
