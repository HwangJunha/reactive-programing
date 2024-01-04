package org.around;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        example1_1();
        example1_2();
    }

    /**
     * 일반적인 명령어 프로그래밍 예시
     */
    public static void example1_1(){
        List<Integer> numbers = Arrays.asList(1,3,21,10,8,11);
        int sum = 0;
        for(int number : numbers){
            if(number > 6 && (number % 2 != 0)){
                sum += number;
            }
        }
        System.out.println("합계: "+sum);
    }

    public static void example1_2(){
        List<Integer> numbers = Arrays.asList(1,3,21,10,8,11);
        int sum = numbers.stream()
                .filter(number -> number > 6 && (number% 2 != 0))
                .mapToInt(number -> number)
                .sum();
        System.out.println("합계: "+sum);
    }
}