import java.util.Random;
public class Main{
  public static void main(String[] args) {
    testQueue();
    testOrderInteger();
    TreeTest.runTest();
  }

  @SuppressWarnings("unchecked")
  private static void testQueue()
  {
  int queueSize = 33;
    Queue a = new Queue<String>();
    for(int i = 0; i< queueSize; i++)
    {
      a.enqueue(i);
    }
    System.out.println("\n Printing queue...");
    for(int i = 0; i< queueSize; i++)
    {
      System.out.println(a.dequeue());
    }
  }
  private static void testOrderInteger()
  {
    Random rnd = new Random();

    int[] array = new int[]{10,1,2,3,4,5,8,3,2,4,5,66,2,3,6,9,10,15,17,2,1,0,2,3,4,6,1};
    int[] subArray = orderedInteger.findLongestSubArray(array);
    String str = orderedInteger.toStringArray(subArray);
    System.out.println("\nPrinting the longest subArray hardcoded... \n" + str);

    int arraySize = 500;
    int[] arrayRnd = new int[arraySize];
    for(int i = 0; i < arraySize; i++)
      arrayRnd[i] = rnd.nextInt(200);
    int[] subArrayRnd = orderedInteger.findLongestSubArray(arrayRnd);
    String strRnd = orderedInteger.toStringArray(subArrayRnd);
    System.out.println("\nPrinting the longest subArray with random numbers... \n" + strRnd);
  }
}
