package it.lists_02;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {


    public static void main(String[] args) {


        List<Integer>  divisorsOf52 = new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);

        List<Integer>  randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisorsOf52);


        System.out.println("The list random numbers contains: " + randomNumbers + "number of elements is: " + randomNumbers.size());

        randomNumbers = randomNumbers.stream().distinct().collect(Collectors.toList());


        System.out.println("The new list random numbers contains: " + randomNumbers + "number of elements is: " + randomNumbers.size());

        Collections.sort(randomNumbers, Collections.reverseOrder());

        System.out.println(randomNumbers);




    }


}