package com.sample.service.JavaPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class GroupingCountry {

    private void getDetails(Map<Character, List<String>> map)
    {
        Set<String> collect = map.values().stream().flatMap(List::stream).collect(Collectors.toSet());
        System.out.println(collect);
    }

    public static void main(String[] args) {

        List<String> countryNames = new ArrayList<String>() {{

            add("India");
            add("Indonacia");
            add("Pakistan");
            add("united kingdoms");
            add("united states");
            add("netherlands");
        }};

        countryNames.sort(Comparator.naturalOrder());
       // Set<Character> collect = countryNames.stream().map(a -> a.charAt(0)).collect(Collectors.toSet());

        Map<Character, List<String>> listMap = countryNames.stream()
                .collect(groupingBy(a->a.charAt(0)));

        System.out.println(listMap);

        listMap.entrySet().forEach(System.out::println);

}
}
