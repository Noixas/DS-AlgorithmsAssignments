public class Main{
  public static void main(String[] args) {
    testQueue();
  }

  @SuppressWarnings("unchecked")
  private static void testQueue()
  {
    Queue a = new Queue<String>();
    for(int i = 0; i<150; i++)
    {
      a.enqueue(i);
    }
    for(int i = 0; i<150; i++)
    {
      System.out.println(a.dequeue());
    }
  }
}
