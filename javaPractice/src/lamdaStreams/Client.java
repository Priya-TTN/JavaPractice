package lamdaStreams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        //    Find below a list of integers. Iterate over it and print the square of each number.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> s1 = numbers.stream();
        s1.forEach((elem) ->{
            System.out.println(elem*elem);
        });


//        Find below a list of integers. Iterate over it and print every even number.
        System.out.println("Question no 2: ");
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> s2 = numbers.stream();
        s2.filter((elem) ->{
                    System.out.println("filtering : " + elem);
                    return elem%2 == 0;
                })
                .forEach((elem) ->{
                    System.out.println(elem);
                });


//        For the list of integers, find all the even numbers. Then, iterate over the even numbers and print each number.
        System.out.println("Question no 3: ");
        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> s3 = numbers3.stream();
        List<Integer> lists3 = s3.filter((elem) -> elem % 2 == 0)
                .collect(Collectors.toList());
        lists3.forEach((elem)->System.out.println(elem));
        System.out.println("Question no 4: ");


//        For a list of integers, return a list of the squares of each number.
        List<Integer> numbers4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> s4 = numbers4.stream();
        List<Integer> list4 = s4.map(elem -> elem*elem)
                .collect(Collectors.toList());
        list4.forEach(elem -> System.out.println(elem));
        System.out.println("Question no 5: ");


//        For a list of strings, return a list of the length of each string.
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        Stream<String> s5 = names.stream();
        List<Integer> list5 = s5.map(String::length)
                .collect(Collectors.toList());
        System.out.println(list5);
        System.out.println("Question no 6:------------------------- ");



//        For a list of strings, filter out the strings which do not start with the letter T and then uppercase the remaining strings.
        List<String> names6 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        Stream<String> s6 = names.stream();
        List<String> list6 = s6.filter((str) ->{
                    return !str.startsWith("T");
                }).map(str -> str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list6);

        System.out.println("Question no 7:------------------------- ");
//        For a list of strings, filter out the strings which do not start with the letter T, then uppercase the remaining strings and then sort them.

        List<String> names7 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        Stream<String> s7 = names.stream();
        List<String> list7 = s7.filter((str) ->{
                    return !str.startsWith("T");
                }).map(str -> str.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list7);


        System.out.println("Question no 8:------------------------- ");
//        For a list of integers, find the sum of all the numbers.
        List<Integer> numbers8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int ans8 = numbers8.stream().
                mapToInt(Integer::intValue).
                sum();
        System.out.println(ans8);



        System.out.println("Question no 9:------------------------- ");
//        For a list of integers, find the sum of the squares of all the numbers.
        List<Integer> numbers9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int ans9 = numbers9.stream()
                .mapToInt(num -> num*num).sum();
        System.out.println("sum of the Square of all numbers "+ans9);



        System.out.println("Question no 10:------------------------- ");
//        For a list of integers, find the sum of the squares of all the even numbers.
        List<Integer> numbers10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> s10 = numbers10.stream();
        int ans10 = s10.filter(elem -> elem%2 == 0).
                mapToInt(num -> num*num)
                .sum();
        System.out.println("sum of the Square of all even numbers "+ans10);




        System.out.println("Question no 11:------------------------- ");
//        Given a list of numbers, find the maximum number in the list.
        List<Integer> numbers11 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> listempty = List.of();
        Stream<Integer> s11 = listempty.stream();
        OptionalInt ans11 = s11.mapToInt(Integer::intValue)
                .max();
        System.out.println("max no in the list " + ans11);//max no in the list OptionalInt.empty




        Stream<Integer> ls11 = listempty.stream();
        int lsans11 = ls11.mapToInt(Integer::intValue)
                .max().orElse(0);
        System.out.println("max no in the list " + lsans11);

        System.out.println("Question no 12:------------------------- ");
//        Given a list of numbers with duplicates, find the distinct numbers in the list.
        List<Integer> numbers12 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        List<Integer> list12 = numbers12.stream().
                distinct().collect(Collectors.toList());
        System.out.println(list12);




        System.out.println("Question no 13:------------------------- ");
//        Given a list of numbers, find the average of all the numbers.
        List<Integer> numbers13 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double avg = numbers13.stream()
                .mapToDouble(Integer :: doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("double using avg: " + avg);
        double avg2 = numbers13.stream()
                .mapToInt(Integer :: intValue)
                .average()
                .orElse(0.0);
        System.out.println("int using avg: " + avg);


        /*he choice between using mapToInt or mapToDouble depends on the nature of your data and the precision you need in your calculations. Here are some considerations:

mapToInt (Primitive int):

Advantages:

More memory-efficient: int uses less memory compared to double.
Faster arithmetic operations: Arithmetic operations on int are generally faster than on double.
Useful for situations where you need whole numbers or dealing with integer-based data.
Considerations:

Loss of precision: If your data includes fractional values, using int may result in loss of precision.
mapToDouble (Primitive double):

Advantages:

Suitable for decimal values: If your data includes fractional values or requires precision, using double is appropriate.
Compatible with floating-point arithmetic.
Considerations:

Slightly higher memory usage: double uses more memory compared to int.
Some loss of precision when working with decimal values.*/


        System.out.println("Question no 14:------------------------- ");
//        Give a list of strings, find the average length of all the strings.
        List<String> names14 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        double len = names14.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0.0);
        System.out.println("avg len of all the strings : "+ len);



        System.out.println("Question no 15:------------------------- ");
//        Given a list of strings, find the first string that is longer than 10 characters.
        List<String> names15 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        String ans15 = names15.stream()
                .filter(str -> str.length() > 10)
                .findFirst().
                orElse("no names in the list");
        System.out.println(ans15);
    }
}