package Cas.generics;

public class GenericSorter {

    public <T extends Comparable<T>> T min(T[] a)
    {
        T smallest = a[0];
        for(T element: a) {
            if(element.compareTo(smallest) < 0)
                smallest = element;
        }
        return smallest;
    }
}
