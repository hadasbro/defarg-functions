package com.github.hadasbro.defargfunctions;
import static com.github.hadasbro.defargfunctions.FunctionalInterfacess.*;

/**
 * FunctionRegistrator
 */
@SuppressWarnings({"unused", "WeakerAccess", "SameParameterValue", "JavaDoc", "Convert2Diamond"})
interface FunctionRegistrator {

    /**
     * Register function
     *
     * 4 params 4 default
     *
     * @param fun - lambda
     * @param def1 - default param
     * @param def2 - default param
     * @param def3 - default param
     * @param def4 - default param
     * @param <RT, T> - type
     * @param <S> - type
     * @param <U> - type
     * @param <W> - type
     * @return Function4DefaultParams4
     */
    static <RT, T, S, U, W> Function.Function4DefaultParams4<RT, T, S, U, W> registerFunction(FunctionParams4Default4<RT, T, S, U, W> fun, T def1, S def2, U def3, W def4) {

        Registrator.checkIllegalArguments(FunctionParams4Default4.class, fun.getClass());

        return (a, b, c, d) -> {
            T ag = (a == null ? def1 : a);
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            return fun.apply(ag, bg, cg, dg);
        };

    }

    /**
     * Register function
     *
     * @param fun - lambda
     * @param def1 - default param
     * @param def2 - default param
     * @param def3 - default param
     * @param def4 - default param
     * @param <RT, T> - type
     * @param <S> - type
     * @param <U> - type
     * @param <W> - type
     * @return Function4DefaultParams3
     */
    static <RT, T, S, U, W> Function.Function4DefaultParams3<RT, T, S, U, W> registerFunction(FunctionParams4Default3<RT, T, S, U, W> fun, Factory.REQUIRED def1, S def2, U def3, W def4) {

        Registrator.checkIllegalArguments(FunctionParams4Default3.class, fun.getClass());

        return (a, b, c, d) -> {
            S bg = (b == null ? def2 : b);
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            return fun.apply(a, bg, cg, dg);
        };

    }

    /**
     * Register function
     *
     * @param fun - lambda
     * @param def1 - default param
     * @param def2 - default param
     * @param def3 - default param
     * @param def4 - default param
     * @param <RT, T> - type
     * @param <S> - type
     * @param <U> - type
     * @param <W> - type
     * @return Function4DefaultParams2
     */
    static <RT, T, S, U, W> Function.Function4DefaultParams2<RT, T, S, U, W> registerFunction(FunctionParams4Default2<RT, T, S, U, W> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, U def3, W def4) {

        Registrator.checkIllegalArguments(FunctionParams4Default2.class, fun.getClass());

        return (a, b, c, d) -> {
            U cg = (c == null ? def3 : c);
            W dg = (d == null ? def4 : d);
            return fun.apply(a, b, cg, dg);
        };

    }

    /**
     * Register function
     *
     * @param fun - lambda
     * @param def1 - default param
     * @param def2 - default param
     * @param def3 - default param
     * @param def4 - default param
     * @param <RT, T> - type
     * @param <S> - type
     * @param <U> - type
     * @param <W> - type
     * @return Function4DefaultParams1
     */
    static <RT, T, S, U, W> Function.Function4DefaultParams1<RT, T, S, U, W> registerFunction(FunctionParams4Default1<RT, T, S, U, W> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, Factory.REQUIRED def3, W def4) {

        Registrator.checkIllegalArguments(FunctionParams4Default1.class, fun.getClass());

        return (a, b, c, d) -> {
            W dg = (d == null ? def4 : d);
            return fun.apply(a, b, c, dg);
        };
    }

    /**
     * registerFunction
     *
     * @param fun
     * @param def1 - default param
     * @param def2
     * @param def3
     * @param <RT, T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <RT, T, S, U> Function.Function3DefaultParams3<RT, T, S, U> registerFunction(FunctionParams3Default3<RT, T, S, U> fun, T def1, S def2, U def3) {

        Registrator.checkIllegalArguments(FunctionParams3Default3.class, fun.getClass());

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
     * @param <RT, T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <RT, T, S, U> Function.Function3DefaultParams2<RT, T, S, U> registerFunction(FunctionParams3Default2<RT, T, S, U> fun, Factory.REQUIRED def1, S def2, U def3) {

        Registrator.checkIllegalArguments(FunctionParams3Default2.class, fun.getClass());

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
     * @param <RT, T>
     * @param <S>
     * @param <U>
     * @return
     */
    static <RT, T, S, U> Function.Function3DefaultParams1<RT, T, S, U> registerFunction(FunctionParams3Default1<RT, T, S, U> fun, Factory.REQUIRED def1, Factory.REQUIRED def2, U def3) {

        Registrator.checkIllegalArguments(FunctionParams3Default1.class, fun.getClass());

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
     * @param <RT, T>
     * @param <S>
     * @return
     */
    static <RT, T, S> Function.Function2DefaultParams2<RT, T, S> registerFunction(FunctionParams2Default2<RT, T, S> fun, T def1, S def2) {

        Registrator.checkIllegalArguments(FunctionParams2Default2.class, fun.getClass());

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
     * @param <RT, T>
     * @param <S>
     * @return
     */
    static <RT, T, S> Function.Function2DefaultParams1<RT, T, S> registerFunction(FunctionParams2Default1<RT, T, S> fun, Factory.REQUIRED def1, S def2) {

        Registrator.checkIllegalArguments(FunctionParams2Default1.class, fun.getClass());

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
     * @param <RT, T>
     * @return
     */
    static <RT, T> Function.Function1DefaultParams1<RT, T> registerFunction(FunctionParams1Default1<RT, T> fun, T def1) {

        Registrator.checkIllegalArguments(FunctionParams1Default1.class, fun.getClass());

        return (a) -> {
            T ag = (a == null ? def1 : a);
            return fun.apply(ag);
        };

    }

}
