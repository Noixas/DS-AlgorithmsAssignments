import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.lang.*;

public class MainSort {
public static void main(String[] args) {
        int amountTests = 5;
        for (int i = 0; i < amountTests; i++ )
                test(i,1000);
        for (int i = 0; i < amountTests; i++ )
                test(i,10000);
        for (int i = 0; i < amountTests; i++ )
                test(i,10000);
        for (int i = 0; i < amountTests; i++ )
                test(i,150000);
        for (int i = 0; i < amountTests; i++ )
                test(i,250000);


}
public static <T> void test(int pAmount, int pTestSize)
{
  if(pAmount == 0)//first test
  System.out.println("\nTest Batch with list size: " + pTestSize);
        Random rnd = new Random();
        List list = new ArrayList<Integer>();
        List copy = new ArrayList<Integer>();
        int testAmount = pTestSize;
        Comparator comp = new IntComparator();


        for(int i = 0; i < testAmount; i++) {
                int number = rnd.nextInt(testAmount);
                list.add(number);
                copy.add(number);
        }
        System.out.println("Test "+pAmount + " Size is: "+list.size());
        long startTime = System.currentTimeMillis();
        list = MergeSort.Sort(list, comp);
        long endTime = System.currentTimeMillis();

        //System.out.println("Start Time " + startTime);
        //System.out.println("End Time " + endTime);
        System.out.println("Total Time " + (endTime - startTime));
        boolean debug = false;
        for(int i = 0; i < testAmount; i++) {
                if(debug)
                        System.out.println("List at: "+i+" has: "+list.get(i) +" Originally had "+ copy.get(i));
        }
}

///
///Test
///Length - Time(In Miliseconds)
///1000 - 9~25
///10000 - 160~200
///100000 - 15000~20000 (Actual tests: 15511~16892~18574~19393)
///150000 - 35000~ 45000 (Actual tests: 34926~38602~41604~44945~43709)
///250000 - 157425~201437
///
///100000 - with BubbleSort(~18414~18785~19465~)
///250000 - with BubbleSort(~191166~210798)
///
///
/*
Tests With Bubble Sort enabled

Test Batch with list size: 1000
Test 0 Size is: 1000
Total Time 9
Test 1 Size is: 1000
Total Time 3
Test 2 Size is: 1000
Total Time 3
Test 3 Size is: 1000
Total Time 2
Test 4 Size is: 1000
Total Time 1

Test Batch with list size: 10000
Test 0 Size is: 10000
Total Time 24
Test 1 Size is: 10000
Total Time 32
Test 2 Size is: 10000
Total Time 21
Test 3 Size is: 10000
Total Time 29
Test 4 Size is: 10000
Total Time 21

Test Batch with list size: 10000
Test 0 Size is: 10000
Total Time 19
Test 1 Size is: 10000
Total Time 17
Test 2 Size is: 10000
Total Time 15
Test 3 Size is: 10000
Total Time 15
Test 4 Size is: 10000
Total Time 19

Test Batch with list size: 150000
Test 0 Size is: 150000
Total Time 1463
Test 1 Size is: 150000
Total Time 1430
Test 2 Size is: 150000
Total Time 1499
Test 3 Size is: 150000
Total Time 1391
Test 4 Size is: 150000
Total Time 1427

Test Batch with list size: 250000
Test 0 Size is: 250000
Total Time 4147
Test 1 Size is: 250000
Total Time 4078
Test 2 Size is: 250000
Total Time 4063
Test 3 Size is: 250000
Total Time 4061
Test 4 Size is: 250000
Total Time 4050
 */
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
/*
Test without BubbleSort
Test Batch with list size: 1000
Test 0 Size is: 1000
Total Time 7
Test 1 Size is: 1000
Total Time 2
Test 2 Size is: 1000
Total Time 2
Test 3 Size is: 1000
Total Time 2
Test 4 Size is: 1000
Total Time 2

Test Batch with list size: 10000
Test 0 Size is: 10000
Total Time 32
Test 1 Size is: 10000
Total Time 23
Test 2 Size is: 10000
Total Time 20
Test 3 Size is: 10000
Total Time 21
Test 4 Size is: 10000
Total Time 18

Test Batch with list size: 10000
Test 0 Size is: 10000
Total Time 19
Test 1 Size is: 10000
Total Time 20
Test 2 Size is: 10000
Total Time 20
Test 3 Size is: 10000
Total Time 21
Test 4 Size is: 10000
Total Time 23

Test Batch with list size: 150000
Test 0 Size is: 150000
Total Time 1426
Test 1 Size is: 150000
Total Time 1523
Test 2 Size is: 150000
Total Time 1749
Test 3 Size is: 150000
Total Time 1598
Test 4 Size is: 150000
Total Time 1483

Test Batch with list size: 250000
Test 0 Size is: 250000
Total Time 7244
Test 1 Size is: 250000
Total Time 6873
Test 2 Size is: 250000
Total Time 4144
Test 3 Size is: 250000
Total Time 4242
Test 4 Size is: 250000
Total Time 4109
 */
}
