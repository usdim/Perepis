package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.example.Human.loader;

public class Main {
    public static void main(String[] args) {
        System.out.println(loader("src/main/resources/input.txt"));
         System.out.println(numberOldman ());


    }
  public static int numberOldman (List<Human> humans){

        Stream<Human> stream = humans.stream() ;


        int z = stream.filter(x-> x.male>=1).sorted(Comparator.comparingInt(x->x.age) ).toList().getLast().number;
        return z;
    }
}