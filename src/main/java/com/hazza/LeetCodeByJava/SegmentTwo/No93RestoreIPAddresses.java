package com.hazza.LeetCodeByJava.SegmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: HazzaCheng
 * Contact: hazzacheng@gmail.com
 * Date: 2017-10-05
 * Time: 8:35 PM
 */
public class No93RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        restoreIp(res, "", s, 0, 0);

        return res;
    }

    private void restoreIp(List<String> res, String path,
                           String ip, int start, int count) {
        int len = ip.length();
        if (count > 4) return;
        if (count == 4 && start == len) res.add(path);

        for (int i = 1; i < 4; i++) {
            if (start + i > len) break;
            String s = ip.substring(start, start + i);
            if ((s.startsWith("0") && s.length() > 1)
                    || (i == 3 && Integer.parseInt(s) >= 256)) continue;
            restoreIp(res, path + s + (count == 3 ? "" : "."),
                    ip, start + i, count + 1);
        }
    }

}
