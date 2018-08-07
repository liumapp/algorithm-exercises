package com.liumapp.algorithm.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author liumapp
 * @file SelectionSorting.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/22/18
 */
public class SelectionSorting extends Example {

    public static Comparable[] sort (Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[i])) {
                    a = exch(a, i, j);
                    show(a);
                }
            }
        }
        return a;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your array , use enter explor: ");
        String in = buff.readLine();
        String[] a = in.split("\\s+");
        Integer[] b = (Integer[]) sort(toInteger(a));
        assert isSorted(a);
    }

}
