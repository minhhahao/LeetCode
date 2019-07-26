package com.hazza.leetcode.SegmentOne;

import java.util.*;

/**
 * Created by hazza on 7/16/17.
 */
public class No30SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        if (s == null || s.equals("") || words.length == 0 || words == null) return res;
        int lenS = s.length(), lenW = words[0].length(), lenWs = words.length;
        if (lenS < lenW * lenWs) return res;
        int last = lenS - lenW + 1;

        //将words中不同的单词加入map，并用一个辅助数组记录它们各自的出现次数
        int[][] tabel = new int[2][lenWs];
        int index = 0, count = 0;
        Map<String, Integer> mapping = new HashMap<String, Integer>(lenWs);
        for (int i = 0; i < lenWs; i++) {
            Integer value = mapping.get(words[i]);
            if (value == null) {
                ++count;
                mapping.put(words[i], index);
                value = index++;
            }
            ++tabel[0][value];
        }

        //遍历一遍s，用一个辅助数组记录下words里每个字符串出现的位置，-1表示该位置没有出现words里的字符串
        int[] occurances = new int[last];
        for (int i = 0; i < last; i++) {
            String word = s.substring(i, i + lenW);
            Integer value = mapping.get(word);
            if (value == null) occurances[i] = -1;
            else occurances[i] = value;
        }
        
        //在线性时间里处理整个字符串
        for (int i = 0; i < lenW; i++) {
            int currentCount = count;
            int left = i, right = i;
            Arrays.fill(tabel[1], 0);

            while (right < last) {
                //查找字符串里第一次全部出现了words里的字符串
                while (currentCount > 0 && right < last) {
                    int target = occurances[right];
                    if (target != -1 && ++tabel[1][target] == tabel[0][target]) --currentCount;
                    right += lenW;
                }
                //判断words里出现的字符串是否是连续出现的
                while (currentCount == 0 && left < right) {
                    int target = occurances[left];
                    //--tabel[1][target]是因为left最后要右移
                    if (target != -1 && --tabel[1][target] == tabel[0][target] - 1) {
                        int length = right - left;
                        if (length / lenW == lenWs) res.add(left);
                        ++currentCount;
                    }
                    left += lenW;
                }
            }
        }

        return res;
    }
}
