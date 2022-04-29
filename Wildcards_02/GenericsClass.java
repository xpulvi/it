package it.Wildcards_02;

import java.util.Objects;

public class GenericsClass <T>{

    private T t;
    //- a public method `setT method that:
    //    - takes a`T` parameter called `valueToSet`
    //    - assign the parameter's value to the current instance's `t`
    public T getT() {
        return t;
    }

    /*
     * - a public method setT method that:
    - takes a `T` parameter called `valueToSet`
    - assign the parameter's value to the current instance's `t`
          */
    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    /*-- a public static generics method`isEqual()`that:
    - takes two generics parameters in input:
        - a `GenericsClass` gc1
        - a `GenericsClass` gc2
    - uses Java's [Object `equals` operator] // gc1.getT().equals(gc2.getT()
    and the `getT()` method to understand if the two `Object`are equal:
        - please note that the `equals()` operator has the following syntax: `object1.equals(object2)`
    - returns a `boolean` (`true` if the two objects are equals,`false` if the two objects are not equals)
    * */

    public static boolean isEqual(GenericsClass gc1, GenericsClass gc2){

        return gc1.getT().equals(gc2.getT());
    }

}
