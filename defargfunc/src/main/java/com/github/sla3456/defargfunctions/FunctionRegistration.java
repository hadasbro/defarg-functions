package com.github.sla3456.defargfunctions;

@SuppressWarnings({"unused", "WeakerAccess", "SameParameterValue", "JavaDoc", "Convert2Diamond"})
public class FunctionRegistration {

    /**
     * checkIllegalArguments
     *
     * @param cls class
     * @param fun registered lambda
     * @throws IllegalArgumentException illegal args exception
     */
    protected static void checkIllegalArguments(final Class<?> cls, final Class<?> fun) throws IllegalArgumentException {}


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
    public static <T, S, U, W> ConsumerInterfaces.Consumer4DefaultParams4<T, S, U, W> registerConsumer(FunctionalInterfacess.ConsumerParams4Default4<T, S, U, W> fun, T def1, S def2, U def3, W def4) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams4Default4.class, fun.getClass());

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
    public static <T, S, U, W> ConsumerInterfaces.Consumer4DefaultParams3<T, S, U, W> registerConsumer(FunctionalInterfacess.ConsumerParams4Default3<T, S, U, W> fun, FunctionFactory.REQUIRED def1, S def2, U def3, W def4) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams4Default3.class, fun.getClass());

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
    static <T, S, U, W> ConsumerInterfaces.Consumer4DefaultParams2<T, S, U, W> registerConsumer(FunctionalInterfacess.ConsumerParams4Default2<T, S, U, W> fun, FunctionFactory.REQUIRED def1, FunctionFactory.REQUIRED def2, U def3, W def4) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams4Default2.class, fun.getClass());

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
    public static <T, S, U, W> ConsumerInterfaces.Consumer4DefaultParams1<T, S, U, W> registerConsumer(FunctionalInterfacess.ConsumerParams4Default1<T, S, U, W> fun, FunctionFactory.REQUIRED def1, FunctionFactory.REQUIRED def2, FunctionFactory.REQUIRED def3, W def4) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams4Default1.class, fun.getClass());

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
    public static <T, S, U> ConsumerInterfaces.Consumer3DefaultParams3<T, S, U> registerConsumer(FunctionalInterfacess.ConsumerParams3Default3<T, S, U> fun, T def1, S def2, U def3) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams3Default3.class, fun.getClass());

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
    public static <T, S, U> ConsumerInterfaces.Consumer3DefaultParams2<T, S, U> registerConsumer(FunctionalInterfacess.ConsumerParams3Default2<T, S, U> fun, FunctionFactory.REQUIRED def1, S def2, U def3) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams3Default2.class, fun.getClass());

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
    static <T, S, U> ConsumerInterfaces.Consumer3DefaultParams1<T, S, U> registerConsumer(FunctionalInterfacess.ConsumerParams3Default1<T, S, U> fun, FunctionFactory.REQUIRED def1, FunctionFactory.REQUIRED def2, U def3) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams3Default1.class, fun.getClass());

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
    public static <T, S> ConsumerInterfaces.Consumer2DefaultParams2<T, S> registerConsumer(FunctionalInterfacess.ConsumerParams2Default2<T, S> fun, T def1, S def2) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams2Default2.class, fun.getClass());

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
    public static <T, S> ConsumerInterfaces.Consumer2DefaultParams1<T, S> registerConsumer(FunctionalInterfacess.ConsumerParams2Default1<T, S> fun, FunctionFactory.REQUIRED def1, S def2) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams2Default1.class, fun.getClass());

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
    public static <T> ConsumerInterfaces.Consumer1DefaultParams1<T> registerConsumer(FunctionalInterfacess.ConsumerParams1Default1<T> fun, T def1) {

        checkIllegalArguments(FunctionalInterfacess.ConsumerParams1Default1.class, fun.getClass());

        return (a) -> {
            T ag = (a == null ? def1 : a);
            fun.apply(ag);
        };

    }

}
