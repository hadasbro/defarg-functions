package com.github.sla3456.defargfunctions;
import net.jodah.typetools.TypeResolver;
import java.util.*;
import java.util.stream.Collectors;


/**
 * FunctionFactory
 *
 * use it to register consumer or function with default parameters
 *
 * usage:

    - register function with default params:

    FunctionFactory.ConsumerDefaultParams2<Integer, Integer, String, Character> myConsumer = FunctionFactory.registerConsumer(
        (Integer a, Integer b, String c, Character e) -> { /CONSUMER BODY/  },
        FunctionFactory.REQUIRED.NO_DEFAULT,
        FunctionFactory.REQUIRED.NO_DEFAULT,
        "default string value",
        'x');

    OR [ Java >= 11 ]

    FunctionFactory.ConsumerDefaultParams4<Integer, Integer, String, Character> myConsumer2=FunctionFactory.registerConsumer(
     (var a,var b,var c,var e)->{ /CONSUMER BODY/  },
     1,
     2,
     "default string value",
     'x');

    - call function:

        myConsumer.apply(1,2);
        myConsumer.apply(1,2,"string value");
        myConsumer.apply(1,2,"string value",'c');

        myConsumer2.apply();
        myConsumer.apply(1);
        myConsumer.apply(1,2);
        myConsumer.apply(1,2,"string value");


    TODO
    - future [after bugfix in java 11]
    + default param values should be in lambda params annotations
    (var a, var bee, @def("def stroing hehe B") var ster, @def("def i B") var charhe) -> {}

    - add functions factory, not only consumer factory
 *
 */

@SuppressWarnings({"unused", "WeakerAccess", "SameParameterValue", "JavaDoc", "Convert2Diamond"})
final public class FunctionFactory extends FunctionRegistration implements ConsumerInterfaces, FunctionalInterfacess {

    /**
     * Required parameter
     */
    enum REQUIRED{NO_DEFAULT}

    /**
     * Allowed parameters
     */
    protected static Set<Class<?>> allowedParamTypes = new TreeSet<Class<?>>(new Comparator<Class<?>>(){

        /**
         * Class1 == Class2 if Class1 object instanceof Class2
         * e.g. Integer == Number, Double == Number etc.
         *
         * @param o1
         * @param o2
         * @return int
         */
        public int compare(Class<?> o1, Class<?> o2) {
            if(o2.isAssignableFrom(o1)){
                return 0;
            } else{
                return (o1.getName().compareTo(o2.getName()));
            }
        }
    })
    {{
        /*
         * allowed params
         */
        add(Number.class);
        add(Character.class);
        add(Date.class);
        add(Boolean.class);
        add(String.class);

    }};

    /**
     * checkIllegalArguments
     *
     * @param cls class
     * @param fun registered lambda
     * @throws IllegalArgumentException illegal args exception
     */
    protected static void checkIllegalArguments(final Class<?> cls, final Class<?> fun) throws IllegalArgumentException {

        // throw an erros with expected function's signature

        Class<?>[] typeArgs = TypeResolver.resolveRawArguments(cls, fun);

        StringJoiner sj = new StringJoiner(",", "Illegal arguments in consumer factory (", ")");

        if(Arrays.stream(typeArgs).anyMatch(e -> !allowedParamTypes.contains(e))){

            sj.add(" Supported arguments must be an instance of: ");

            sj.add(
                    allowedParamTypes
                            .stream()
                            .map(Objects::toString)
                            .collect(Collectors.joining(", "))
            );

            throw new IllegalArgumentException(sj.toString());

        }

    }

}
