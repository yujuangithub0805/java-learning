package org.yujuan.java.learning;

import org.yujuan.java.learning.bean.People;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        filter();
//        distinct();
//        limit();
//        skip();
//        map();
//        flatMap();
//        allMatch();
//        anyMatch();
//        noneMatch();
//        count();
//        findFirst();
//        findAny();
//        reduce();
//        maxBy();
//        summingInt();
//        averagingInt();
//        summarizingInt();
//        foreach();
//        join();
//        groupingBy();
//        partitioningBy();
    }

    private static void filter() {
        List<Integer> integers = Arrays.asList(1, 1, 2, 3, 4, 5);
        List<Object> collect = integers.stream().filter(a -> a > 3).collect(Collectors.toList());
        //输出结果:[4, 5]
        System.out.println(collect);
    }

    private static void distinct() {
        List<Integer> integers = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6);
        List<Integer> collect = integers.stream().distinct().collect(Collectors.toList());
        //[1, 2, 3, 4, 5, 6]
        System.out.println(collect);
    }

    private static void limit() {
        List<Integer> integers = Arrays.asList(1, 1, 2, 3, 1, 2, 4, 5, 6);
        List<Integer> collect = integers.stream().limit(4).collect(Collectors.toList());
        //[1, 1, 2, 3]
        System.out.println(collect);
    }

    private static void skip() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 2, 1, 4, 5, 6);
        List<Integer> collect = integers.stream().skip(2).collect(Collectors.toList());
        //[3, 4, 2, 1, 4, 5, 6]
        System.out.println(collect);
    }

    private static void map() {
        List<String> strings = Arrays.asList("yujuan", "jake", "tom");
        List<Integer> collect = strings.stream().map(String::length).collect(Collectors.toList());
        //[6, 4, 3]
        System.out.println(collect);
    }

    private static void flatMap() {
        List<String> strings = Arrays.asList("Hello", "World");
        List<String> collect = strings.stream().map(world -> world.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    private static void allMatch() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        if (integers.stream().allMatch(i -> i > 0)) {
            System.out.println("所有值值大于0");
        }
    }

    private static void anyMatch() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        if (integers.stream().anyMatch(integer -> integer > 3)) {
            System.out.println("存在大于3");
        }
    }

    private static void noneMatch() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        if (integers.stream().noneMatch(i -> i < 0)) {
            System.out.println("值都小于3");
        }
    }

    private static void count() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        long count = integers.stream().count();
        //5
        System.out.println(count);
    }

    private static void findFirst() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer integer = integers.stream().filter(item -> item > 3).findFirst().get();
        //4
        System.out.println(integer);
    }

    private static void findAny() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer integer = integers.stream().filter(item -> item > 3).findAny().get();
        //通过findAny方法查找到其中一个大于三的元素并打印，因为内部进行优化的原因，当找到第一个满足大于三的元素时就结束，该方法结果和findFirst方法结果一样。提供findAny方法是为了更好的利用并行流，findFirst方法在并行上限制更多【本篇文章将不介绍并行流】
        System.out.println(integer);
    }

    private static void reduce() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        Integer reduce = integers.stream().reduce(0, (a, b) -> (a + b));
        Integer reduce = integers.stream().reduce(10, Integer::sum);
        //25
        System.out.println(reduce);
    }

    private static void max() {
        List<Integer> integers = Arrays.asList(1, 3, 4, 5, 2, 10);
        Integer integer = integers.stream().max(Integer::compareTo).get();
        System.out.println(integer);
    }

    private static void maxBy() {
        List<Integer> integers = Arrays.asList(1, 3, 4, 5, 2, 10);
        Integer integer = integers.stream().collect(Collectors.maxBy(Integer::compareTo)).get();
        System.out.println(integer);
    }

    private static void summingInt() {
        List<String> views = Arrays.asList("wsbs", "xafaswzx", "b8fw", "ad");
//        Integer integer = views.stream().collect(Collectors.summingInt(String::length));
//        Integer integer = views.stream().mapToInt(String::length).sum();
        int integer = views.stream().mapToInt(String::length).reduce(Integer::sum).getAsInt();
        System.out.println(integer);
    }

    private static void averagingInt() {
        List<Integer> integers = Arrays.asList(1, 3, 4, 5, 10);
        Double collect = integers.stream().collect(Collectors.averagingInt(Integer::byteValue));
        System.out.println(collect);
    }

    private static void summarizingInt() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 10, 3, 9);
        IntSummaryStatistics collect = integers.stream().collect(Collectors.summarizingInt(Integer::byteValue));
        double average = collect.getAverage();
        long count = collect.getCount();
        int max = collect.getMax();
        int min = collect.getMin();
        long sum = collect.getSum();
        System.out.println(average);
        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }

    private static void foreach() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 10);
        integers.stream().forEach(System.out::println);
    }

    private static void join() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        String collect = integers.stream().map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(collect);
    }

    private static void groupingBy() {
        List<People> people = Arrays.asList(new People("Jim", "student"), new People("sam", "parent"), new People("Jake", "children"), new People("Jane", "student"));
        Map<String, List<People>> collect = people.stream().collect(Collectors.groupingBy(People::getType));
        System.out.println(collect);
    }

    private static void partitioningBy() {
        List<People> people = Arrays.asList(new People("Jim", "student"), new People("sam", "parent", false), new People("Jake", "children"), new People("Jane", "student"));
        Map<Boolean, List<People>> collect = people.stream().collect(Collectors.partitioningBy(People::getAdult));
        System.out.println(collect);
    }

}


