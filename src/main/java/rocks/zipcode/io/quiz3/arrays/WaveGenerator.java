package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c<= 90 || c >= 97 && c <= 122) {
                StringUtils stringUtils = new StringUtils();
                strList.add(stringUtils.capitalizeNthCharacter(str, i));
            }
        }
        String[] strArr = new String[strList.size()];
        return strList.toArray(strArr);
    }
}

