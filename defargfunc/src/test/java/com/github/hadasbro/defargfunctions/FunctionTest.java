package com.github.hadasbro.defargfunctions;

import com.github.hadasbro.defargfunctions.Function.*;
import org.junit.Test;

import java.util.Arrays;

import static com.github.hadasbro.defargfunctions.Factory.REQUIRED.NO_DEFAULT;
import static com.github.hadasbro.defargfunctions.Registrator.registerFunction;
import static org.junit.Assert.assertEquals;

public class FunctionTest {

    private static String concatInts(Integer... integers) {
        return String.join("---", Arrays.stream(integers).map(Object::toString).toArray(String[]::new));
    }

    @Test
    public void funtionOneParamTest(){

        Function1DefaultParams1<String, Integer> func1a = registerFunction(
                FunctionTest::concatInts,1
        );

        assertEquals(func1a.apply(), "1");

        assertEquals(func1a.apply(11), "11");

    }

    @Test
    public void funtionTwoParamsTest(){

        Function2DefaultParams2<String, Integer, Integer> func2a = registerFunction(
                (Integer a, Integer b) ->concatInts(a, b),1, 2
        );

        Function2DefaultParams1<String, Integer, Integer> func2b = registerFunction(
                (Integer a, Integer b) -> concatInts(a, b), NO_DEFAULT, 2
        );

        assertEquals(func2a.apply(), "1---2");

        assertEquals(func2a.apply(11), "11---2");

        assertEquals(func2a.apply(11, 22), "11---22");


        assertEquals(func2b.apply(11), "11---2");

        assertEquals(func2b.apply(11, 22), "11---22");

    }

    @Test
    public void funtionThreeParamsTest(){

        Function3DefaultParams3<String, Integer, Integer, Integer> func3a = registerFunction(
                (Integer a, Integer b, Integer c) -> concatInts(a, b, c), 1, 2, 3
        );

        Function3DefaultParams2<String, Integer, Integer, Integer> func3b = registerFunction(
                (Integer a, Integer b, Integer c) -> concatInts(a, b, c), NO_DEFAULT, 2, 3
        );

        Function3DefaultParams1<String, Integer, Integer, Integer> func3c = registerFunction(
                (Integer a, Integer b, Integer c) -> concatInts(a, b, c), NO_DEFAULT, NO_DEFAULT, 3
        );


        assertEquals(func3a.apply(), "1---2---3");

        assertEquals(func3a.apply(11), "11---2---3");

        assertEquals(func3a.apply(11, 22), "11---22---3");

        assertEquals(func3a.apply(11, 22, 33), "11---22---33");

        assertEquals(func3b.apply(11), "11---2---3");

        assertEquals(func3b.apply(11, 22), "11---22---3");

        assertEquals(func3b.apply(11, 22, 33), "11---22---33");

        assertEquals(func3c.apply(11, 22), "11---22---3");

        assertEquals(func3c.apply(11, 22, 33), "11---22---33");

    }

    @Test
    public void funtionFourParamsTest(){

        Function4DefaultParams4<String, Integer, Integer, Integer, Integer> func4a = registerFunction(
                (Integer a, Integer b, Integer c, Integer d) -> concatInts(a, b, c, d), 1, 2, 3, 4
        );

        Function4DefaultParams3<String, Integer, Integer, Integer, Integer> func4b = registerFunction(
                (Integer a, Integer b, Integer c, Integer d) -> concatInts(a, b, c, d), NO_DEFAULT, 2, 3, 4
        );

        Function4DefaultParams2<String, Integer, Integer, Integer, Integer> func4c = registerFunction(
                (Integer a, Integer b, Integer c, Integer d) -> concatInts(a, b, c, d), NO_DEFAULT, NO_DEFAULT, 3, 4
        );

        Function4DefaultParams1<String, Integer, Integer, Integer, Integer> func4d = registerFunction(
                (Integer a, Integer b, Integer c, Integer d) -> concatInts(a, b, c, d), NO_DEFAULT, NO_DEFAULT, NO_DEFAULT, 4
        );

        assertEquals(func4a.apply(),"1---2---3---4");
        assertEquals(func4a.apply(11),"11---2---3---4");
        assertEquals(func4a.apply(11, 22),"11---22---3---4");
        assertEquals(func4a.apply(11, 22, 33),"11---22---33---4");
        assertEquals(func4a.apply(11, 22, 33, 44),"11---22---33---44");

        assertEquals(func4b.apply(11),"11---2---3---4");
        assertEquals(func4b.apply(11, 22),"11---22---3---4");
        assertEquals(func4b.apply(11, 22, 33),"11---22---33---4");
        assertEquals(func4b.apply(11, 22, 33, 44),"11---22---33---44");

        assertEquals(func4c.apply(11, 22),"11---22---3---4");
        assertEquals(func4c.apply(11, 22, 33),"11---22---33---4");
        assertEquals(func4c.apply(11, 22, 33, 44),"11---22---33---44");

        assertEquals(func4d.apply(11,22,33),"11---22---33---4");
        assertEquals(func4d.apply(11,22,33, 44),"11---22---33---44");


    }

}
