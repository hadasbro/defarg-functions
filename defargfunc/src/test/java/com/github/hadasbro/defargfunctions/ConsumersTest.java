package com.github.hadasbro.defargfunctions;

import com.github.hadasbro.defargfunctions.Consumer.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static com.github.hadasbro.defargfunctions.Registrator.registerConsumer;
import static org.junit.Assert.assertTrue;

public class ConsumersTest {

    /**
     * consumerOneParamTest
     *
     * [1 param]
     */
    @Test
    public void consumerOneParamTest() {

        ArrayList<Integer> results = new ArrayList<>();

        var _consumer1DefaultParams1 = registerConsumer(
                results::add, 11
        );

        _consumer1DefaultParams1.apply();
        assertTrue(results.contains(11));

        results.clear();

        _consumer1DefaultParams1.apply(22);
        assertTrue(results.contains(22));
    }

    /**
     * consumerTwoParamsTest
     *
     * [2 params]
     */
    @Test
    public void consumerTwoParamsTest() {

        ArrayList<Integer> results = new ArrayList<>();

        var _consumer2DefaultParams2 = registerConsumer(
                (var a, var b) -> results.add(a + b), 11, 10
        );

        Consumer2DefaultParams1<Integer, Integer> _consumer2DefaultParams1 = registerConsumer(
                (Integer a, Integer b) -> results.add(a + b), Factory.REQUIRED.NO_DEFAULT, 10
        );

        Consumer2DefaultParams1<Integer, Integer> _consumer2DefaultParams0 = registerConsumer(
                (Integer a, Integer b) -> results.add(a + b), Factory.REQUIRED.NO_DEFAULT, 2
        );

        _consumer2DefaultParams2.apply();
        assertTrue(results.contains(21));

        _consumer2DefaultParams2.apply(1);
        assertTrue(results.contains(11));

        _consumer2DefaultParams2.apply(1, 2);
        assertTrue(results.contains(3));

        results.clear();

        _consumer2DefaultParams1.apply(1);
        assertTrue(results.contains(11));

        _consumer2DefaultParams1.apply(1, 2);
        assertTrue(results.contains(3));

        results.clear();

        _consumer2DefaultParams0.apply(1);
        assertTrue(results.contains(3));

        _consumer2DefaultParams0.apply(3, 5);
        assertTrue(results.contains(8));


    }

    /**
     * consumerThreeParamsTest
     *
     * [3 params]
     */
    @Test
    public void consumerThreeParamsTest() {

        ArrayList<Integer> results = new ArrayList<>();

        var _consumer3DefaultParams3 = registerConsumer(
                (var a, var b, var c) -> results.add(a + b + c), 9, 11, 10
        );

        Consumer3DefaultParams2<Integer, Integer, Integer> _consumer3DefaultParams2 = registerConsumer(
                (Integer a, Integer b, Integer c) -> results.add(a + b + c), Factory.REQUIRED.NO_DEFAULT, 10, 20
        );

        Consumer3DefaultParams1<Integer, Integer, Integer> _consumer3DefaultParams1 = registerConsumer(
                (Integer a, Integer b, Integer c) -> results.add(a + b + c), Factory.REQUIRED.NO_DEFAULT, Factory.REQUIRED.NO_DEFAULT, 3
        );

        _consumer3DefaultParams3.apply();
        _consumer3DefaultParams3.apply(11);
        _consumer3DefaultParams3.apply(11, 12);
        _consumer3DefaultParams3.apply(11, 12, 13);

        assertTrue(IntStream.of(30, 32, 33, 36).allMatch(results::contains));

        results.clear();

        _consumer3DefaultParams2.apply(11);
        _consumer3DefaultParams2.apply(11, 12);
        _consumer3DefaultParams2.apply(11, 12, 13);

        assertTrue(IntStream.of(41, 43, 36).allMatch(results::contains));

        results.clear();

        _consumer3DefaultParams1.apply(11, 12);
        _consumer3DefaultParams1.apply(11, 12, 13);

        assertTrue(IntStream.of(26, 36).allMatch(results::contains));

    }

    /**
     * consumerFourParamsTest
     *
     * [4 params]
     */
    @Test
    public void consumerFourParamsTest() {

        List<Integer> results = new ArrayList<>();

        var _consumer4DefaultParams4 = registerConsumer(
                (var a, var b, var c, var d) -> results.add(a + b + c + d),
                1, 2, 3, 4
        );

        Consumer4DefaultParams3<Integer, Integer, Integer, Integer> _consumer4DefaultParams3 = registerConsumer(
                (Integer a, Integer b, Integer c, Integer d) -> results.add(a + b + c + d),
                Factory.REQUIRED.NO_DEFAULT, 2, 3, 4
        );


        Consumer4DefaultParams2<Integer, Integer, Integer, Integer> _consumer4DefaultParams2 = registerConsumer(
                (Integer a, Integer b, Integer c, Integer d) -> results.add(a + b + c + d),
                Factory.REQUIRED.NO_DEFAULT, Factory.REQUIRED.NO_DEFAULT, 3, 4
        );

        Consumer4DefaultParams1<Integer, Integer, Integer, Integer> _consumer4DefaultParams1 = registerConsumer(
                (Integer a, Integer b, Integer c, Integer d) -> results.add(a + b + c + d),
                Factory.REQUIRED.NO_DEFAULT, Factory.REQUIRED.NO_DEFAULT, Factory.REQUIRED.NO_DEFAULT, 4
        );

        _consumer4DefaultParams4.apply();
        _consumer4DefaultParams4.apply(11);
        _consumer4DefaultParams4.apply(11, 22);
        _consumer4DefaultParams4.apply(11, 22, 33);
        _consumer4DefaultParams4.apply(11, 22, 33, 44);

        assertTrue(IntStream.of(10, 20, 40, 70, 110).allMatch(results::contains));

        results.clear();

        _consumer4DefaultParams3.apply(11);
        _consumer4DefaultParams3.apply(11, 12);
        _consumer4DefaultParams3.apply(11, 12, 13);
        _consumer4DefaultParams3.apply(11, 12, 13, 14);

        assertTrue(IntStream.of(20, 30, 40, 50).allMatch(results::contains));

        results.clear();

        _consumer4DefaultParams2.apply(11, 12);
        _consumer4DefaultParams2.apply(11, 12, 13);
        _consumer4DefaultParams2.apply(11, 12, 13, 14);

        assertTrue(IntStream.of(30, 40, 50).allMatch(results::contains));

        results.clear();

        _consumer4DefaultParams1.apply(11, 12, 13);
        _consumer4DefaultParams1.apply(11, 12, 13, 14);
        assertTrue(IntStream.of(40, 50).allMatch(results::contains));

    }

}