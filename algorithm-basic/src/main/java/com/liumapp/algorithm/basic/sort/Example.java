package com.liumapp.algorithm.basic.sort;

import jdk.internal.util.xml.impl.Input;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author liumapp
 * @file Example.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/21/18
 * 数组排序实现框架
 */
public class Example {

    public static Comparable[] sort (Comparable[] a) {
        Comparable[] result = new Comparable[a.length];
        return result;
    }

    public static boolean less (Comparable v, Comparable w) {
        return v.compareTo(w) < 0 ;
    }

    public static Comparable[] exch (Comparable[] a, int i , int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
        return a;
    }

    public static void show (Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static boolean isSorted (Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your array , use enter explor: ");
        String in = buff.readLine();
        String[] a = in.split("\\s+");
        sort(a);
        assert isSorted(a);
        show(a);
    }

}
