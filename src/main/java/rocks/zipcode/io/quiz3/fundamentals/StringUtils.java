package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String[] letters = str.split("");
        letters[indexToCapitalize] = letters[indexToCapitalize].toUpperCase();
        return String.join("", letters);

    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {

        Set<String> substrings = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 1; j <= string.length()-i; j++) {
                substrings.add(string.substring(i, i+j));
            }
        }
        String[] substrArray = new String[substrings.size()];
        return substrings.toArray(substrArray);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
