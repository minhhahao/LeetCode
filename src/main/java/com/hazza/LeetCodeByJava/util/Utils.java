package com.hazza.LeetCodeByJava.util;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-15
 * Time: 5:09 PM
 */
public class Utils {
    public static <T> String list2Str(List<T> list) {
        StringBuffer sb = new StringBuffer();
        for (T o: list)
            sb.append(o + " ");

        return sb.toString();
    }

    public static <T> String doubleList2Str(List<List<T>> list) {
        StringBuffer sb = new StringBuffer();
        for (List<T> l : list) {
            for (T o : l)
                sb.append(o + " ");
            sb.append("| ");
        }

        return sb.toString();
    }

    public static String getRandomStr(int len) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++)
            sb.append((char)(random.nextInt(26) + 97));

        return sb.toString();
    }

    public static class doubleListComp<T> implements Comparator<List<T>> {

        @Override
        public int compare(List<T> ts, List<T> t1) {
            return list2Str(ts).compareTo(list2Str(t1));
        }
    }
}
