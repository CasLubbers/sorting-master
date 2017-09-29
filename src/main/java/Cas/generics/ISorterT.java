package Cas.generics;

public interface ISorterT<T extends Comparable<T>> {
    T[] sort(T[] a);
}
