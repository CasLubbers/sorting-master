package Cas.generics;

public class MemoryCell<T extends Comparable<T>> implements Comparable<MemoryCell<T>> {

    private T storedValue;

    public T read() {
        return storedValue;
    }

    public void write (T x) {
        storedValue = x;
    }

    public int compareTo(MemoryCell<T> o) {
       return storedValue.compareTo(o.read());
    }
}
