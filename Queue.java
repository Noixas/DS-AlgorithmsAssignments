import java.util.Stack;
public class Queue<T>{
  private Stack<T> _aStack;
  private Stack<T> _bStack;
public Queue()
{
  _aStack = new Stack<T>();
  _bStack = new Stack<T>();
}
public void enqueue(T newObject)
{
   while(_aStack.empty() == false)//Move all to b
   {
     _bStack.push(_aStack.pop());
   }
   _aStack.push(newObject); //add the last element of the queue
   while(_bStack.empty() == false)
   {
     _aStack.push(_bStack.pop());//Put everything back
   }
}
public T dequeue()
{
  return _aStack.pop();
}
public int size()
{
  return _aStack.size();
}

}
