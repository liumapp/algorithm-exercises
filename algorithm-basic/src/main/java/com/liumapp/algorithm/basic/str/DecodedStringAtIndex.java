package com.liumapp.algorithm.basic.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 An encoded string S is given.
 To find and write the decoded string to a tape
 the encoded string is read one character at a time and the following steps are taken:
    * If the character read is a letter
        that letter is written onto the tape
    * If the character read is a digit (say d)
        the entire current tape is repeatedly written d-1 more times in total
 Now for some encoded string S
 and an index K
 find and return the K-th letter (1 indexed) in the decoded string.

 给出了编码字符串S

 要查找并写入解码字符串到磁带，编码字符串一次读取一个字符，并采取以下步骤：

 如果读的字符是一个字母，那个字母就写在磁带上。

 如果字符读取是一个数字（如D），则整个当前磁带重复写入D-1以上。

 现在，对于一些编码字符串S和索引k，查找并返回解码字符串中的第k个字母（1索引）

 示范1：
 Input: S = "leet2code3", K = 10
 Output: "o"
 Explanation:
 The decoded string is "leetleetcodeleetleetcodeleetleetcode".
 The 10th letter in the string is "o".

 示范2：
 Input: S = "ha22", K = 5
 Output: "h"
 Explanation:
 The decoded string is "hahahaha".  The 5th letter is "h".

 示范3：
 Input: S = "a2345678999999999999999", K = 1
 Output: "a"
 Explanation:
 The decoded string is "a" repeated 8301530446056247680 times.  The 1st letter is "a".

 notes:
 2 <= S.length <= 100
 S will only contain lowercase letters and digits 2 through 9.
 S starts with a letter.
 1 <= K <= 10^9
 The decoded string is guaranteed to have less than 2^63 letters.

 * @author liumapp
 * @file DecodedStringAtIndex.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/8/7
 */
public class DecodedStringAtIndex {

    public String decodedStringAtIndex (String S, int K) {
        long size = 0;
        int N = S.length();

        // Find size = length of decoded string
        for (int i = 0; i < N; ++i) {
            char c = S.charAt(i);
            if (Character.isDigit(c))
                size *= c - '0'; // - '0' convert char to int
            else
                size++;
        }

        for (int i = N-1; i >= 0; --i) {
            char c = S.charAt(i);
            K %= size;
            if (K == 0 && Character.isLetter(c))
                return Character.toString(c);

            if (Character.isDigit(c))
                size /= c - '0';
            else
                size--;
        }

        throw null;
    }

    public static void main (String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecodedStringAtIndex decodedStringAtIndex = new DecodedStringAtIndex();
        try {
            System.out.println("plz enter S :");
            String S = br.readLine();
            System.out.println("plz enter K :");
            int K = Integer.parseInt(br.readLine());
            System.out.println(decodedStringAtIndex.decodedStringAtIndex(S, K));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
