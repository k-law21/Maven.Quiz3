package rocks.zipcode.io.quiz3.generics;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;


    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType oddOccurring = null;
        SomeType[] listUnique = null;
        for (SomeType st : listUnique) {
            Collection<?> convertedToList = null;
            if (Collections.frequency(convertedToList, st) % 2 == 0) {
                oddOccurring = st;
            }
        }
        return oddOccurring;
    }

    public SomeType findEvenOccurringValue() {
        SomeType evenOccurring = null;
        SomeType[] listUnique = null;
        for (SomeType st : listUnique) {
            Collection<?> convertedToList = null;
            if (Collections.frequency(convertedToList, st) % 2 == 0) {
                evenOccurring = st;
            }
        }
        return evenOccurring;
    }


    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for (SomeType x : array) {
            if (x.equals(valueToEvaluate)) {
                count++;
            }

        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return array;
    }
}
