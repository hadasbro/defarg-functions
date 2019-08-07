package com.github.hadasbro.defargfunctions;

@SuppressWarnings({"unused", "WeakAccess", "WeakerAccess"})
public interface Function {

    /**
     * common Function interface
     */
    interface FunctionDefaultParamsCommon{}

    /**
     * Registered Function interfaces
     * Matrix of Function methods
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Function4DefaultParams4<RT, T, S, U, W> extends Function4DefaultParams3<RT, T, S, U, W> {
        /**
         * apply
         * @return RT
         */
        default RT apply(){
            return apply(null, null,null,null);
        }
    }

    /**
     * Function4DefaultParams3
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Function4DefaultParams3<RT, T, S, U, W> extends Function4DefaultParams2<RT, T, S, U, W> {
        /**
         * apply
         *
         * @param a -
         * @return RT
         */
        default RT apply(T a){
            return apply(a, null,null,null);
        }
    }

    /**
     * Function4DefaultParams2
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Function4DefaultParams2<RT, T, S, U, W> extends Function4DefaultParams1<RT, T, S, U, W> {
        /**
         * apply
         *
         * @param a -
         * @param b -
         * @return RT
         */
        default RT apply(T a, S b){
            return apply(a, b, null,null);}
    }

    /**
     * Function4DefaultParams1
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Function4DefaultParams1<RT, T, S, U, W> extends Function4DefaultParams0<RT, T, S, U, W> {
        /**
         * apply
         * @param a -
         * @param b -
         * @param c -
         * @return RT
         */
        default RT apply(T a, S b, U c){
            return apply(a, b, c,null);
        }
    }

    /**
     * Function4DefaultParams0
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     * @param <W>
     */
    interface Function4DefaultParams0<RT, T, S, U, W> extends FunctionDefaultParamsCommon {
        /**
         * apply
         *
         * @param a -
         * @param b -
         * @param c -
         * @param d -
         * @return RT
         */
        RT apply(T a, S b, U c, W d);
    }

    /**
     * 3 param Functions
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     */
    interface Function3DefaultParams3<RT, T, S, U> extends Function3DefaultParams2<RT, T, S, U> {
        /**
         * apply
         *
         * @return RT
         */
        default RT apply(){
            return apply(null, null,null);
        }
    }

    /**
     * Function3DefaultParams2
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     */
    interface Function3DefaultParams2<RT, T, S, U> extends Function3DefaultParams1<RT, T, S, U> {
        /**
         * apply
         *
         * @param a -
         * @return RT
         */
        default RT apply(T a){
            return apply(a, null, null);
        }
    }

    /**
     * Function3DefaultParams1
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     */
    interface Function3DefaultParams1<RT, T, S, U> extends Function3DefaultParams0<RT, T, S, U> {
        /**
         * apply
         *
         * @param a -
         * @param b -
         * @return RT
         */
        default RT apply(T a, S b){
            return apply(a, b, null);
        }
    }

    /**
     * Function3DefaultParams0
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     * @param <U>
     */
    interface Function3DefaultParams0<RT, T, S, U> extends FunctionDefaultParamsCommon {
        /**
         * apply
         *
         * @param a -
         * @param b -
         * @param c -
         * @return RT
         */
        RT apply(T a, S b, U c);
    }

    /**
     * 2 params Functions
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     */
    interface Function2DefaultParams2<RT, T, S> extends Function2DefaultParams1<RT, T, S> {
        /**
         * apply
         *
         * @return RT
         */
        default RT apply(){
            return apply(null, null);
        }
    }

    /**
     * Function2DefaultParams1
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     */
    interface Function2DefaultParams1<RT, T, S> extends Function2DefaultParams0<RT, T, S> {
        /**
         * apply
         *
         * @param a -
         * @return RT
         */
        default RT apply(T a){
            return apply(a, null);
        }
    }

    /**
     * Function2DefaultParams0
     *
     * @param <RT>
     * @param <T>
     * @param <S>
     */
    interface Function2DefaultParams0<RT, T, S> extends FunctionDefaultParamsCommon {
        /**
         * apply
         *
         * @param a -
         * @param b -
         * @return RT
         */
        RT apply(T a, S b);
    }

    /**
     * 1 param Function
     *
     * @param <RT>
     * @param <T>
     */
    interface Function1DefaultParams1<RT, T> extends Function1DefaultParams0<RT, T> {
        default RT apply(){
            return apply(null);
        }
    }

    /**
     * Function1DefaultParams0
     *
     * @param <RT>
     * @param <T>
     */
    interface Function1DefaultParams0<RT, T> extends FunctionDefaultParamsCommon {
        /**
         * apply
         *
         * @param a -
         * @return RT
         */
        RT apply(T a);
    }

}
