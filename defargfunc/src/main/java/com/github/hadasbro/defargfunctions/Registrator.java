package com.github.hadasbro.defargfunctions;
import com.github.hadasbro.defargfunctions.Consumer.*;
import com.github.hadasbro.defargfunctions.FunctionalInterfacess.*;

@SuppressWarnings({"unused", "WeakerAccess", "SameParameterValue", "JavaDoc", "Convert2Diamond"})
public class Registrator {

    /**
     * Register consumer
     *
     * 4 params 4 default
     *
     * @param fun - lambda
     * @param def1 - default param
     * @param def2 - default param
     * @param def3 - default param
     * @param def4 - default param
     * @param <T> - type
     * @param <S> - type
     * @param <U> - type
     * @param <W> - type
     * @return Consumer4DefaultParams4
     */
    static <T, S, U, W> Consumer4DefaultParams4<T, S, U, W> registerConsumer(ConsumerParams4Default4<T, S, U, W> fun, T def1, S def2, U def3, W def4) {

        checkIllegalArguments(ConsumerParams4Default4.class, fun.getClass());

        return (a, b, c, d) -> {
            T ag = (a == null ? def1 : a);
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            fun.apply(ag, bg, cg, dg);
        };

    }

    /**
     * Register consumer
     *
     * @param fun - lambda
     * @param def1 - default param
     * @param def2 - default param
     * @param def3 - default param
     * @param def4 - default param
     * @param <T> - type
     * @param <S> - type
     * @param <U> - type
     * @param <W> - type
     * @return Consumer4DefaultParams3
     */
    static <T, S, U, W> Consumer4DefaultParams3<T, S, U, W> registerConsumer(ConsumerParams4Default3<T, S, U, W> fun, Factory.REQUIRED def1, S def2, U def3, W def4) {

        checkIllegalArguments(ConsumerParams4Default3.class, fun.getClass());

        return (a, b, c, d) -> {
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            fun.apply(a, bg, cg, dg);
        };

    }

    /**
     * Register consumer
     *
     * @param fun - lambda
     * @param def1 - default param
     * @param def2 - default param
     * @param def3 - default param
     * @param def4 - default param
     * @param <T> - type
     * @param <S> - type
     * @param <U> - type
     * @param <W> - type
     * @return Consumer4DefaultParams2
     */
    static <T, S, U, W> Consumer4DefaultParams2<T, S, U, W> registerConsumer(ConsumerParams4Default2<T, S, U, W> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, U def3, W def4) {

        checkIllegalArguments(ConsumerParams4Default2.class, fun.getClass());

        return (a, b, c, d) -> {
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            fun.apply(a, b, cg, dg);
        };

    }

    /**
     * Register consumer
     *
     * @param fun - lambda
     * @param def1 - default param
     * @param def2 - default param
     * @param def3 - default param
     * @param def4 - default param
     * @param <T> - type
     * @param <S> - type
     * @param <U> - type
     * @param <W> - type
     * @return Consumer4DefaultParams1
     */
    static <T, S, U, W> Consumer4DefaultParams1<T, S, U, W> registerConsumer(ConsumerParams4Default1<T, S, U, W> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, Factory.REQUIRED def3, W def4) {

        checkIllegalArguments(ConsumerParams4Default1.class, fun.getClass());

        return (a, b, c, d) -> {
            W dg = (d == null ? def4 : d);
            fun.apply(a, b, c, dg);
        };
    }

    /**
     * registerConsumer
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param <T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <T, S, U> Consumer3DefaultParams3<T, S, U> registerConsumer(ConsumerParams3Default3<T, S, U> fun, T def1, S def2, U def3) {

        checkIllegalArguments(ConsumerParams3Default3.class, fun.getClass());

        return (a, b, c) -> {
            T ag = (a == null ? def1 : a);
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            fun.apply(ag, bg, cg);
        };

    }

    /**
     * registerConsumer
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param <T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <T, S, U> Consumer3DefaultParams2<T, S, U> registerConsumer(ConsumerParams3Default2<T, S, U> fun, Factory.REQUIRED def1, S def2, U def3) {

        checkIllegalArguments(ConsumerParams3Default2.class, fun.getClass());

        return (a, b, c) -> {
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            fun.apply(a, bg, cg);
        };

    }

    /**
     * registerConsumer
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param <T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <T, S, U> Consumer3DefaultParams1<T, S, U> registerConsumer(ConsumerParams3Default1<T, S, U> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, U def3) {

        checkIllegalArguments(ConsumerParams3Default1.class, fun.getClass());

        return (a, b, c) -> {
            U cg = (c == null ? def3 : c);
            fun.apply(a, b, cg);
        };

    }

    /**
     * registerConsumer
     *
     * @param fun
     * @param def1
     * @param def2
     * @param <T>
     * @param <S>
     * @return
     */
    static <T, S> Consumer2DefaultParams2<T, S> registerConsumer(ConsumerParams2Default2<T, S> fun, T def1, S def2) {

        checkIllegalArguments(ConsumerParams2Default2.class, fun.getClass());

        return (a, b) -> {
            T ag = (a == null ? def1 : a);
            S bg = (b == null ? def2 : b);
            fun.apply(ag, bg);
        };

    }

    /**
     * registerConsumer
     *
     * @param fun
     * @param def1
     * @param def2
     * @param <T>
     * @param <S>
     * @return
     */
    static <T, S> Consumer2DefaultParams1<T, S> registerConsumer(ConsumerParams2Default1<T, S> fun, Factory.REQUIRED def1, S def2) {

        checkIllegalArguments(ConsumerParams2Default1.class, fun.getClass());

        return (a, b) -> {
            S bg = (b == null ? def2 : b);
            fun.apply(a, bg);
        };

    }

    /**
     * registerConsumer
     *
     * @param fun
     * @param def1
     * @param <T>
     * @return
     */
    static <T> Consumer1DefaultParams1<T> registerConsumer(ConsumerParams1Default1<T> fun, T def1) {

        checkIllegalArguments(ConsumerParams1Default1.class, fun.getClass());

        return (a) -> {
            T ag = (a == null ? def1 : a);
            fun.apply(ag);
        };

    }

    //###################################################
    //################# Functions #######################
    //###################################################

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param def4
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     * @return
     */
    static <RT, T, S, U, W> Function.Function4DefaultParams4<RT, T, S, U, W> registerFunction(FunctionParams4Default4<RT, T, S, U, W> fun, T def1, S def2, U def3, W def4) {

        checkIllegalArguments(FunctionParams4Default4.class, fun.getClass());

        return (a, b, c, d) -> {
            T ag = (a == null ? def1 : a);
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            return fun.apply(ag, bg, cg, dg);
        };

    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param def4
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     * @return
     */
    static <RT, T, S, U, W> Function.Function4DefaultParams3<RT, T, S, U, W> registerFunction(FunctionParams4Default3<RT, T, S, U, W> fun, Factory.REQUIRED def1, S def2, U def3, W def4) {

        checkIllegalArguments(FunctionParams4Default3.class, fun.getClass());

        return (a, b, c, d) -> {
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            return fun.apply(a, bg, cg, dg);
        };

    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param def4
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     * @return
     */
    static <RT, T, S, U, W> Function.Function4DefaultParams2<RT, T, S, U, W> registerFunction(FunctionParams4Default2<RT, T, S, U, W> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, U def3, W def4) {

        checkIllegalArguments(FunctionParams4Default2.class, fun.getClass());

        return (a, b, c, d) -> {
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            return fun.apply(a, b, cg, dg);
        };

    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param def4
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     * @return
     */
    static <RT, T, S, U, W> Function.Function4DefaultParams1<RT, T, S, U, W> registerFunction(FunctionParams4Default1<RT, T, S, U, W> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, Factory.REQUIRED def3, W def4) {

        checkIllegalArguments(FunctionParams4Default1.class, fun.getClass());

        return (a, b, c, d) -> {
            W dg = (d == null ? def4 : d);
            return fun.apply(a, b, c, dg);
        };
    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <RT, T, S, U> Function.Function3DefaultParams3<RT, T, S, U> registerFunction(FunctionParams3Default3<RT, T, S, U> fun, T def1, S def2, U def3) {

        checkIllegalArguments(FunctionParams3Default3.class, fun.getClass());

        return (a, b, c) -> {
            T ag = (a == null ? def1 : a);
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            return fun.apply(ag, bg, cg);
        };

    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <RT, T, S, U> Function.Function3DefaultParams2<RT, T, S, U> registerFunction(FunctionParams3Default2<RT, T, S, U> fun, Factory.REQUIRED def1, S def2, U def3) {

        checkIllegalArguments(FunctionParams3Default2.class, fun.getClass());

        return (a, b, c) -> {
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            return fun.apply(a, bg, cg);
        };

    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param def3
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <RT, T, S, U> Function.Function3DefaultParams1<RT, T, S, U> registerFunction(FunctionParams3Default1<RT, T, S, U> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, U def3) {

        checkIllegalArguments(FunctionParams3Default1.class, fun.getClass());

        return (a, b, c) -> {
            U cg = (c == null ? def3 : c);
            return fun.apply(a, b, cg);
        };

    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param <RT>
     * @param <T>
     * @param <S>
     * @return
     */
    static <RT, T, S> Function.Function2DefaultParams2<RT, T, S> registerFunction(FunctionParams2Default2<RT, T, S> fun, T def1, S def2) {

        checkIllegalArguments(FunctionParams2Default2.class, fun.getClass());

        return (a, b) -> {
            T ag = (a == null ? def1 : a);
            S bg = (b == null ? def2 : b);
            return fun.apply(ag, bg);
        };

    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param def2
     * @param <RT>
     * @param <T>
     * @param <S>
     * @return
     */
    static <RT, T, S> Function.Function2DefaultParams1<RT, T, S> registerFunction(FunctionParams2Default1<RT, T, S> fun, Factory.REQUIRED def1, S def2) {

        checkIllegalArguments(FunctionParams2Default1.class, fun.getClass());

        return (a, b) -> {
            S bg = (b == null ? def2 : b);
            return fun.apply(a, bg);
        };

    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1
     * @param <RT>
     * @param <T>
     * @return
     */
    static <RT, T> Function.Function1DefaultParams1<RT, T> registerFunction(FunctionParams1Default1<RT, T> fun, T def1) {

        checkIllegalArguments(FunctionParams1Default1.class, fun.getClass());

        return (a) -> {
            T ag = (a == null ? def1 : a);
            return fun.apply(ag);
        };

    }

    /**
     * checkIllegalArguments
     *
     * @param cls class
     * @param fun registered lambda
     * @throws IllegalArgumentException illegal args exception
     */
    protected static void checkIllegalArguments(final Class<?> cls, final Class<?> fun) throws IllegalArgumentException {}

}
