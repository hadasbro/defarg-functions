package org.bitbucket.defargfunctions;
import static org.bitbucket.defargfunctions.FunctionFactory.*;

public class Main {

    public static void main(String[] args) {



        /*
            consumer with 2 parameters and 1 default value
         */
        Consumer2DefaultParams1<Integer, String> doSomethingElse = registerConsumer(

                // consumer
                (Integer a, String str) -> {

                    // consumer body
                    System.out.println(a + " - " + str);

                },

                // mark param 1 as mandatory
                REQUIRED.NO_DEFAULT,

                //default value for param 2
                "default string"
        );



        /*
            consumer with 4 parameter and 2 default values
         */
        Consumer4DefaultParams2<Integer, Integer, String, Character> myConsumer = registerConsumer(

            // consumer
            (Integer a, Integer b, String c, Character e) -> System.out.println(
                    a + " -> " + b + "  ->  " + c + "  -> " + e
            ),

            // param 1 marked as mandatory
            REQUIRED.NO_DEFAULT,

            // param 2 marked as mandatory
            REQUIRED.NO_DEFAULT,

            // default value for param 3
            "default string",

            // default value for param 4
            'x'

        );

        myConsumer.

        // consumer call results:

        myConsumer.apply(2, 3, "test", 'a');
        // result: 2 -> 3  ->  test  -> a

        myConsumer.apply(2, 3, "test2");
        // result: 2 -> 3  ->  test  -> a

        myConsumer.apply(2, 3);
        // result: 2 -> 3  ->  default string  -> x


        /*
            JAVA 11 consumer example
         */
        Consumer2DefaultParams2<Integer, String> doSomethingNew = registerConsumer(

                // consumer
                (var a, var str) -> {

                    // consumer body
                    System.out.println(a + " - " + str);

                },

                // default value param 1
                150,

                // default value param 2
                "default string b"
        );

        doSomethingNew.apply(); // 150 - default string b
        doSomethingNew.apply(12); // 12 - default string b
        doSomethingNew.apply(13, "test string"); // 13 - test string

    }
}
