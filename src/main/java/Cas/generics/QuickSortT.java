package Cas.generics;

public class QuickSortT<T extends Comparable<T>> implements ISorterT<T>  {
    public T[] sort(T[] a) {
        return quickSort(a,0,a.length-1);
    }

    int partition(T[] a, int l, int r)
    {
        T pivot = a[r];
        int i = (l-1);
        for (int j=l; j<r; j++)
        {
            if (a[j].compareTo(pivot) < 0)
            {
                i++;

                T tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }

        T tmp = a[i+1];
        a[i+1] = a[r];
        a[r] = tmp;

        return i+1;
    }

    T[] quickSort(T[] a, int l, int r)
    {
        if (l < r)
        {
            int pivot = partition(a, l, r);

            quickSort(a, l, pivot-1);
            quickSort(a, pivot+1, r);
        }
        return a;
    }

    public int getPivot(int[] a) {
        int l = a[0];
        int r = a[a.length-1];
        int c = a[(a.length-1)/2];

        if(l > c && l < r) return l;
        if(c > l && c < r) return c;
        if(r > c && r < l) return r;
        return 0;
    }
}
