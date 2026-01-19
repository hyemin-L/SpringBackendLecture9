package org.example.Head04_JCF.example12;

import java.util.*;
import java.util.stream.Collectors;

public class SummarizingExample {
    public static void main(String[] args) {
        List<Integer> intScores = Arrays.asList(80, 95, 70, 100, 85);
        List<Double> doubleScores = Arrays.asList(1.5, 7.8, 9.4, 6.0,3.3);
        List<Long> longScores = Arrays.asList(1L, 2L, 3L, 4L, 5L);

        // TODO IntSummaryStatistics 구현
        IntSummaryStatistics intSummaryStatistics = intScores.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        DoubleSummaryStatistics doubleSummaryStatistics = doubleScores.stream()
                .collect(Collectors.summarizingDouble(Double::doubleValue));
        LongSummaryStatistics longSummaryStatistics = longScores.stream()
                .collect(Collectors.summarizingLong(Long::longValue));

        System.out.println("Int Summary Count = " + intSummaryStatistics.getCount());
        System.out.println("Int Summary Sum = " + intSummaryStatistics.getSum());
        System.out.println("Int Summary Min = " + intSummaryStatistics.getMin());
        System.out.println("Int Summary Max = " + intSummaryStatistics.getMax());
        System.out.println("Int Summary Average = " + intSummaryStatistics.getAverage());

        System.out.println("Double Summary Count = " + doubleSummaryStatistics.getCount());
        System.out.println("Double Summary Sum = " + doubleSummaryStatistics.getSum());
        System.out.println("Double Summary Min = " + doubleSummaryStatistics.getMin());
        System.out.println("Double Summary Max = " + doubleSummaryStatistics.getMax());
        System.out.println("Double Summary Average = " + doubleSummaryStatistics.getAverage());

        System.out.println("Long Summary Count = " + longSummaryStatistics.getCount());
        System.out.println("Long Summary Sum = " + longSummaryStatistics.getSum());
        System.out.println("Long Summary Min = " + longSummaryStatistics.getMin());
        System.out.println("Long Summary Max = " + longSummaryStatistics.getMax());
        System.out.println("Long Summary Average = " + longSummaryStatistics.getAverage());


    }
}
