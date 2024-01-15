package org.around;

import reactor.core.publisher.Flux;

public class Example2 {
    public static void main(String[] args) {
        example2_5();
    }

    /**
     * upstream, downstream 간단한 예제
     */
    public static void example2_5(){
        Flux
                .just(1,2,3,4,5,6)
                .filter(n -> n%2 == 0)
                .map(n -> n*2)
                .subscribe(System.out::println);

    }
}