package com.github.sla3456.defargfunctions;

@SuppressWarnings({"WeakAccess", "WeakerAccess","unused"})
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


}

