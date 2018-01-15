package com.hazza.LeetCodeByJava.util;

import java.util.List;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 18-1-15
 * Time: 5:09 PM
 */
public class Utils {
    public static String doubleList2Str(List<List<Integer>> list) {
        StringBuffer sb = new StringBuffer();
        for (List<Integer> l : list)
            for (Object o : l)
                sb.append(o + " ");

        return sb.toString();
    }

}
