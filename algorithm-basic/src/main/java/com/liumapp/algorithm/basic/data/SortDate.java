package com.liumapp.algorithm.basic.data;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liumapp
 * @file SortDate.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/21/18
 */
@Component
public class SortDate implements Comparable<Date> {

    @Override
    public int compareTo(Date o) {
        return 0;
    }

}
