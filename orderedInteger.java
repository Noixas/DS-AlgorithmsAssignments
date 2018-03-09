import java.util.List;
import java.util.LinkedList;
public class orderedInteger {
/**
 * Find the longest sub Array ordered from smaller to bigger
 * @param  int[] pArray        [Array to be checked]
 * @return       [The longest ordered subArray]
 */
public static int[] findLongestSubArray(int[] pArray)
{
        int startIndex = 0;
        int lastNumber = pArray[0];
        int endIndex = 0;
        int iterationStart = 0;
        for(int i = 1; i < pArray.length; i++)
        {
            boolean last = i == pArray.length-1 ;
                 if(lastNumber > pArray[i] || last) {//Check if next number is smaller which brakes the order
                        if((endIndex - startIndex) < ((i-1) - iterationStart))//check if the array is bigger
                        {
                          if(last)
                          endIndex = i;
                          else
                                endIndex = i-1;
                                startIndex = iterationStart;
                        }
                        iterationStart = i;
                }
                lastNumber = pArray[i];
        }
        int subSize = endIndex - startIndex + 1;
        int[] subArray = new int[subSize];
        for(int i = 0; i< subSize; i++) //Write the result in a new array
                subArray[i] = pArray[i+startIndex];
        return subArray;
}
public static String toStringArray(int[] pArray)
{
        String out = "";
        for(int i = 0; i < pArray.length; i++)
        {
                out += pArray[i] + "\n";
        }
        return out;
}
}
