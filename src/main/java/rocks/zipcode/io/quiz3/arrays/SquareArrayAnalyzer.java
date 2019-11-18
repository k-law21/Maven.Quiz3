package rocks.zipcode.io.quiz3.arrays;

import com.sun.tools.corba.se.idl.StructEntry;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        for (int i = 0; i < inputArray.length-1; i++) {
            for (int j = 0; j < squaredValues.length-1; j++) {
                if(!inputArray[i * i].equals(squaredValues[j]))
                return false;

            }

        }
        return false;
    }
}