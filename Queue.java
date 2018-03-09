
public class Queue<T>{
  private SimpleStack<T> _aStack;
  private SimpleStack<T> _bStack;
public Queue()
{
  _aStack = new SimpleStack<T>();
  _bStack = new SimpleStack<T>();
}
public void enqueue(T newObject)
{
   while(_aStack.isEmpty() == false)//Move all to b
   {
     _bStack.push(_aStack.pop());
   }
   _aStack.push(newObject); //add the last element of the queue
   while(_bStack.isEmpty() == false)
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
public boolean isEmpty(){
  return true;
}
public T first(){
return _aStack.top();
}
}
