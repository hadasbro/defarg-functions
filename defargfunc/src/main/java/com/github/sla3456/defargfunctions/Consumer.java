package com.github.sla3456.defargfunctions;

@SuppressWarnings({"unused", "WeakAccess", "WeakerAccess"})
public interface Consumer {

    /**
     * common consumer interface
     */
    interface ConsumerDefaultParamsCommon{}


    /**
     * Registered consumer interfaces
     * Matrix of consumer methods
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Consumer4DefaultParams4<T, S, U, W> extends Consumer4DefaultParams3<T, S, U, W> {
        /**
         * apply
         */
        default void apply(){apply(null, null,null,null);}
    }

    /**
     * Consumer4DefaultParams3
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Consumer4DefaultParams3<T, S, U, W> extends Consumer4DefaultParams2<T, S, U, W> {
        /**
         * apply
         *
         * @param a -
         */
        default void apply(T a){apply(a, null,null,null);}
    }

    /**
     * Consumer4DefaultParams2
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Consumer4DefaultParams2<T, S, U, W> extends Consumer4DefaultParams1<T, S, U, W> {
        /**
         * apply
         *
         * @param a -
         * @param b -
         */
        default void apply(T a, S b){apply(a, b, null,null);}
    }

    /**
     * Consumer4DefaultParams1
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Consumer4DefaultParams1<T, S, U, W> extends Consumer4DefaultParams0<T, S, U, W> {
        /**
         * apply
         *
         * @param a -
         * @param b -
         * @param c -
         */
        default void apply(T a, S b, U c){apply(a, b, c,null);}
    }

    /**
     * Consumer4DefaultParams0
     *
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Consumer4DefaultParams0<T, S, U, W> extends ConsumerDefaultParamsCommon {
        /**
         * apply
         *
         * @param a -
         * @param b -
         * @param c -
         * @param d -
         */
        void apply(T a, S b, U c, W d);
    }

    /**
     * 3 param consumers
     *
     * @param <T>
     * @param <S>
     * @param <U>
     */
    interface Consumer3DefaultParams3<T, S, U> extends Consumer3DefaultParams2<T, S, U> {
        /**
         * apply
         */
        default void apply(){apply(null, null,null);}
    }

    /**
     * Consumer3DefaultParams2
     *
     * @param <T>
     * @param <S>
     * @param <U>
     */
    interface Consumer3DefaultParams2<T, S, U> extends Consumer3DefaultParams1<T, S, U> {
        /**
         * apply
         *
         * @param a -
         */
        default void apply(T a){apply(a, null, null);}
    }

    /**
     * Consumer3DefaultParams1
     *
     * @param <T>
     * @param <S>
     * @param <U>
     */
    interface Consumer3DefaultParams1<T, S, U> extends Consumer3DefaultParams0<T, S, U> {
        /**
         * apply
         *
         * @param a -
         * @param b -
         */
        default void apply(T a, S b){apply(a, b, null);}
    }

    /**
     * Consumer3DefaultParams0
     *
     * @param <T>
     * @param <S>
     * @param <U>
     */
    interface Consumer3DefaultParams0<T, S, U> extends ConsumerDefaultParamsCommon {
        /**
         * apply
         *
         * @param a -
         * @param b -
         * @param c -
         */
        void apply(T a, S b, U c);
    }

    /**
     * 2 params consumers
     *
     * @param <T>
     * @param <S>
     */
    interface Consumer2DefaultParams2<T, S> extends Consumer2DefaultParams1<T, S> {
        /**
         * apply
         */
        default void apply(){apply(null, null);}
    }

    /**
     * Consumer2DefaultParams1
     *
     * @param <T>
     * @param <S>
     */
    interface Consumer2DefaultParams1<T, S> extends Consumer2DefaultParams0<T, S> {
        /**
         * apply
         *
         * @param a -
         */
        default void apply(T a){apply(a, null);}
    }

    /**
     * Consumer2DefaultParams0
     *
     * @param <T>
     * @param <S>
     */
    interface Consumer2DefaultParams0<T, S> extends ConsumerDefaultParamsCommon {
        /**
         * apply
         *
         * @param a -
         * @param b -
         */
        void apply(T a, S b);
    }

    /**
     * 1 param consumer
     *
     * @param <T>
     */
    interface Consumer1DefaultParams1<T> extends Consumer1DefaultParams0<T> {
        /**
         * apply
         */
        default void apply(){apply(null);}
    }

    /**
     * Consumer1DefaultParams0
     *
     * @param <T>
     */
    interface Consumer1DefaultParams0<T> extends ConsumerDefaultParamsCommon {
        /**
         * apply
         *
         * @param a -
         */
        void apply(T a);
    }

}
