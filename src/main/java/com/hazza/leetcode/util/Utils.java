package com.hazza.leetcode.util;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-15
 * Time: 5:09 PM
 */
public class Utils {
    public static <T extends Comparable<? super T>> String list2Str(List<T> list) {
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (T o: list)
            sb.append(o).append(" ");

        return sb.toString();
    }

    public static <T extends Comparable<? super T>> String doubleList2Str(List<List<T>> list) {
        StringBuilder sb = new StringBuilder();
        for (List<T> l : list) {
            for (T o : l)
                sb.append(o).append(" ");
            sb.append("| ");
        }

        return sb.toString();
    }

    public static String getRandomStr(int len) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append((char)(random.nextInt(26) + 97));

        return sb.toString();
    }

    public static class doubleListComp<T extends Comparable<? super T>> implements Comparator<List<T>> {

        @Override
        public int compare(List<T> ts, List<T> t1) {
            return list2Str(ts).compareTo(list2Str(t1));
        }
    }
}
