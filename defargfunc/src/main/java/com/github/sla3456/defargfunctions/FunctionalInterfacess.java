package com.github.sla3456.defargfunctions;

@SuppressWarnings({"WeakAccess", "WeakerAccess","unused","UnusedReturnValue"})
public interface FunctionalInterfacess {

    /**
     * Consumer interfces
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface ConsumerParams4Multi<T, S, U, W> {void apply(T te, S s, U u, W w);}

    /**
     * ConsumerParams4Default4
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface ConsumerParams4Default4<T, S, U, W>  extends ConsumerParams4Multi<T, S, U, W> {}

    /**
     * ConsumerParams4Default3
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface ConsumerParams4Default3<T, S, U, W>  extends ConsumerParams4Multi<T, S, U, W> {}

    /**
     * ConsumerParams4Multi
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface ConsumerParams4Default2<T, S, U, W>  extends ConsumerParams4Multi<T, S, U, W> {}

    /**
     * ConsumerParams4Multi
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface ConsumerParams4Default1<T, S, U, W>  extends ConsumerParams4Multi<T, S, U, W> {}

    /**
     * ConsumerParams4Default0
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface ConsumerParams4Default0<T, S, U, W>  extends ConsumerParams4Multi<T, S, U, W> {}

    /**
     * ConsumerParams3Multi
     *
     * @param <T>
     * @param <S>
     * @param <U>
     */
    @FunctionalInterface interface ConsumerParams3Multi<T, S, U> {void apply(T te, S s, U u);}

    /**
     *
     * @param <T>
     * @param <S>
     * @param <U>
     */
    @FunctionalInterface interface ConsumerParams3Default3<T, S, U>  extends ConsumerParams3Multi<T, S, U> {}

    /**
     * ConsumerParams3Default2
     *
     * @param <T>
     * @param <S>
     * @param <U>
     */
    @FunctionalInterface interface ConsumerParams3Default2<T, S, U>  extends ConsumerParams3Multi<T, S, U> {}

    /**
     * ConsumerParams3Default1
     *
     * @param <T>
     * @param <S>
     * @param <U>
     */
    @FunctionalInterface interface ConsumerParams3Default1<T, S, U>  extends ConsumerParams3Multi<T, S, U> {}

    /**
     * ConsumerParams2Multi
     *
     * @param <T>
     * @param <S>
     */
    @FunctionalInterface interface ConsumerParams2Multi<T, S> {void apply(T te, S s);}

    /**
     *
     * @param <T>
     * @param <S>
     */
    @FunctionalInterface interface ConsumerParams2Default2<T, S>  extends ConsumerParams2Multi<T, S> {}

    /**
     *
     * @param <T>
     * @param <S>
     */
    @FunctionalInterface interface ConsumerParams2Default1<T, S>  extends ConsumerParams2Multi<T, S> {}

    /**
     * ConsumerParams2Default0
     *
     * @param <T>
     * @param <S>
     */
    @FunctionalInterface interface ConsumerParams2Default0<T, S>  extends ConsumerParams2Multi<T, S> {}

    /**
     * ConsumerParams1Multi
     *
     * @param <T>
     */
    @FunctionalInterface interface ConsumerParams1Multi<T> {void apply(T te);}

    /**
     * ConsumerParams1Default1
     *
     * @param <T>
     */
    @FunctionalInterface interface ConsumerParams1Default1<T>  extends ConsumerParams1Multi<T> {}

    /**
     * FunctionParams4Multi
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface FunctionParams4Multi<RT, T, S, U, W> {RT apply(T te, S s, U u, W w);}

    /**
     * FunctionParams4Default4
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface FunctionParams4Default4<RT, T, S, U, W>  extends FunctionParams4Multi<RT, T, S, U, W> {}

    /**
     * FunctionParams4Default3
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface FunctionParams4Default3<RT, T, S, U, W>  extends FunctionParams4Multi<RT, T, S, U, W> {}

    /**
     * FunctionParams4Default2
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface FunctionParams4Default2<RT, T, S, U, W>  extends FunctionParams4Multi<RT, T, S, U, W> {}

    /**
     * FunctionParams4Default1
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface FunctionParams4Default1<RT, T, S, U, W>  extends FunctionParams4Multi<RT, T, S, U, W> {}

    /**
     * FunctionParams4Default0
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    @FunctionalInterface interface FunctionParams4Default0<RT, T, S, U, W>  extends FunctionParams4Multi<RT, T, S, U, W> {}

    /**
     * FunctionParams3Multi
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     */
    @FunctionalInterface interface FunctionParams3Multi<RT, T, S, U> {RT apply(T te, S s, U u);}

    /**
     * FunctionParams3Default3
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     */
    @FunctionalInterface interface FunctionParams3Default3<RT, T, S, U>  extends FunctionParams3Multi<RT, T, S, U> {}

    /**
     * FunctionParams3Default2
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     */
    @FunctionalInterface interface FunctionParams3Default2<RT, T, S, U>  extends FunctionParams3Multi<RT, T, S, U> {}

    /**
     * FunctionParams3Default1
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     */
    @FunctionalInterface interface FunctionParams3Default1<RT, T, S, U>  extends FunctionParams3Multi<RT, T, S, U> {}

    /**
     * FunctionParams2Multi
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     */
    @FunctionalInterface interface FunctionParams2Multi<RT, T, S> {RT apply(T te, S s);}

    /**
     * FunctionParams2Default2
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     */
    @FunctionalInterface interface FunctionParams2Default2<RT, T, S>  extends FunctionParams2Multi<RT, T, S> {}

    /**
     * FunctionParams2Default1
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     */
    @FunctionalInterface interface FunctionParams2Default1<RT, T, S>  extends FunctionParams2Multi<RT, T, S> {}

    /**
     * FunctionParams2Default0
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     */
    @FunctionalInterface interface FunctionParams2Default0<RT, T, S>  extends FunctionParams2Multi<RT, T, S> {}

    /**
     * FunctionParams1Multi
     *
     * @param <T>
     */
    @FunctionalInterface interface FunctionParams1Multi<RT, T> {RT apply(T te);}

    /**
     * FunctionParams1Default1
     *
     * @param <RT>
     * @param <T>
     */
    @FunctionalInterface interface FunctionParams1Default1<RT, T>  extends FunctionParams1Multi<RT, T> {}


}

