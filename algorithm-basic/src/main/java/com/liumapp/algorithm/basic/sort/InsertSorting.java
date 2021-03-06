package com.liumapp.algorithm.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                a = exch(a, j, j-1);
                showInLine(a);
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
