package com.example.moreexample.Models;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Tính tổng của tất cả các số
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Tổng của các số là: " + sum);
        List<String> fruits = Arrays.asList("Pineapple", "Banana", "Grapes", "Orange", "Apple");

        // Sắp xếp các loại trái cây theo thứ tự bảng chữ cái
        fruits.stream()
                .sorted()
                .forEach(System.out::println);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvenNumbers = numbers1.stream()
                .filter(num -> num % 2 != 0) // Lọc các số chẵn
                .mapToInt(num -> num)         // Chuyển Stream thành IntStream
                .sum();                       // Tính tổng

        System.out.println("Tổng của các số lẻ là: " + sumOfEvenNumbers);

        List<String> School = new ArrayList<String>();
        School.add("Thái Phiên");
        School.add("Trần Phú");
        School.add("Phan Châu Trinh");
        School.add("Thanh Khê");

        Stream<String> stream = School.stream().filter(s -> s.startsWith("P"));
        List<String> mapped =  stream.collect(Collectors.toList());
        System.out.println(mapped);

        List<Integer> Zed = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream1 = Zed.stream().sorted(Comparator.reverseOrder());//Thực hiện
        List<Integer> arranged = stream1.collect(Collectors.toList());//Thu kết quả vào biến
        System.out.println(arranged);
    }
}
