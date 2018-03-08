public class Main{
  public static void main(String[] args) {
    Queue a = new Queue<Integer>();
    for(int i = 0; i<10; i++)
    {
      a.enqueue(i);
    }
    for(int i = 0; i<10; i++)
    {
    System.out.println(  a.dequeue());
    }
  }
}
