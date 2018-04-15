import com.google.common.math.BigIntegerMath;
import edu.illinois.cs.cs125.sortlib.Sorting;
import java.util.Arrays;

/**
 * A class that prints a big factorial.
 */
public class BigFactorial {
    public static void main(final String[] unused) {
        int[] inputArray = new int[] { 1, 3, 2 };
        Sorting.mergeSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
        System.out.println(BigIntegerMath.factorial(100));
    }
}
