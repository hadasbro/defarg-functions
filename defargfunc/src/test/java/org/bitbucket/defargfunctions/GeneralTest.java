package org.bitbucket.defargfunctions;

import org.junit.Test;

import java.util.ArrayList;

import static org.bitbucket.defargfunctions.FunctionRegistration.registerConsumer;
import static org.junit.Assert.assertTrue;

@SuppressWarnings({"WeakerAccess", "WeakAccess", "unused"})
public class GeneralTest {

    @Test
    public void generalTest() {

        ArrayList<String> results = new ArrayList<>();

        class Test{

            ConsumerInterfaces.Consumer2DefaultParams2<Integer, String> consumer = registerConsumer(

                    // consumer
                    (var a, var str) -> {

                        // consumer body
                        results.add(a + " - " + str);

                    },

                    // default value for param 2
                    14,

                    // default value for param 2
                    "default string b"
            );

            public Test(){
                consumer.apply(); // 14 - default string b
                consumer.apply(12); // 12 - default string b
                consumer.apply(15, "abc"); // 15 - abc
            }

        }

        Test test = new Test();

        assertTrue(results.contains("14 - default string b"));
        assertTrue(results.contains("12 - default string b"));
        assertTrue(results.contains("15 - abc"));


        /*
            consumer with 1 parameter and 1 default value
         */
        ConsumerInterfaces.Consumer1DefaultParams1<Integer> doSomething = registerConsumer(

                // consumer
                (Integer a) -> results.add(a.toString()),

                //default param 1
                150
        );

        results.clear();

        doSomething.apply(); // 150
        doSomething.apply(250); // 250

        assertTrue(results.contains("150"));
        assertTrue(results.contains("250"));

        /*
            consumer with 2 parameters and 1 default value
         */
        ConsumerInterfaces.Consumer2DefaultParams1<Integer, String> doSomethingElse = registerConsumer(

                // consumer
                (Integer a, String str) -> results.add((a + " - " + str)),

                // mark param 1 as mandatory
                FunctionFactory.REQUIRED.NO_DEFAULT,

                //default value for param 2
                "default string"
        );

        doSomethingElse.apply(1); // 1 - default string
        doSomethingElse.apply(250, "something"); // 250 - something


        assertTrue(results.contains("1 - default string"));
        assertTrue(results.contains("250 - something"));


        /*
            consumer with 4 parameter and 2 default values
         */
        ConsumerInterfaces.Consumer4DefaultParams2<Integer, Integer, String, String> myConsumer = registerConsumer(

                // consumer
                (Integer a, Integer b, String c, String e) -> { System.out.println(a + "->" + b + "->" + c + "->" + e);
                        results.add(a + "->" + b + "->" + c + "->" + e);
                },

                // param 1 marked as mandatory
                FunctionFactory.REQUIRED.NO_DEFAULT,

                // param 2 marked as mandatory
                FunctionFactory.REQUIRED.NO_DEFAULT,

                // default value for param 3
                "default string",

                // default value for param 4
                "x"

        );

        // consumer call results:

        myConsumer.apply(2, 3, "test", "a");
        // result: 2 -> 3  ->  test  -> a

        myConsumer.apply(2, 3, "test2");
        // result: 2 -> 3  ->  test  -> a

        myConsumer.apply(2, 3);
        // result: 2 -> 3  ->  default string  -> x


        assertTrue(results.contains("2->3->test->a"));
        assertTrue(results.contains("2->3->test->a"));
        assertTrue(results.contains("2->3->default string->x"));


    }

}
