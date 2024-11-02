package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Human {


    int age;
    int male;
    int number;

    public Human(int age, int male, int number) {
        this.age = age;
        this.male = male;
        this.number = number;

    }

    public static List<Human> loader(String fname) {

        List<Human> humans = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(fname))) {
            int c=0;
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] mas = s.split(" ");
                int a= Integer.parseInt(mas[0]);
                int b= Integer.parseInt(mas[1]);
                c= c+1;
                Human h = new Human(a,b,c);
                humans.add(h);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ошибка");

        }

        return humans;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", male=" + male +
                ", number=" + number +

                '}';
    }
}
