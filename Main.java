import java.util.Random;
public class Main{
  public static void main(String[] args) {
    testQueue();
    testOrderInteger();
    TreeTest tree = new TreeTest();
    tree.runTest();
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
    int arraySize = 1000;
    int[] array = new int[arraySize];
    for(int i = 0; i < arraySize; i++)
      array[i] = rnd.nextInt(50);
    int[] subArray = orderedInteger.findLongestSubArray(array);
    String str = orderedInteger.toStringArray(subArray);
    System.out.println("\nPrinting the longest subArray... \n" + str);
  }
}
