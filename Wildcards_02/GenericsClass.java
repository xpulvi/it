package it.Wildcards_02;

import java.util.Objects;

public class GenericsClass <T>{

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }
/*
    @Override
    public static boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericsClass<?> that = (GenericsClass<?>) o;
        return Objects.equals(t, that.t);
    }
*/
    @Override
    public int hashCode() {
        return Objects.hash(t);
    }
}
