package com.liumapp.algorithm.basic.sort;

/**
 * @author liumapp
 * @file InsertSorting.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/30/18
 */
public class InsertSorting extends Example {

    public static Comparable[] sort (Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 &&  less(a[j], a[j - 1]); j--) {
                exch(a, j, j-1);
            }
        }
        return a;
    }

}
