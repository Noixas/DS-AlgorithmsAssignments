public class SimpleStack<T> implements Stack<T>{
  private T[] _array;
  private int _topIndex;
  private int _maxRaySize;

  @SuppressWarnings("unchecked")
  public SimpleStack(){
    _maxRaySize = 16;
    _array = (T[]) new Object[_maxRaySize];
    _topIndex = 0;
  }
  public T pop(){
    if(isEmpty())  return null;
    _topIndex--;
    T out = _array[_topIndex];
    _array[_topIndex] = null;
    return out;
  }
public void push(T obj){
    if(_topIndex == _maxRaySize)
        expandArray();
    _array[_topIndex] = obj;
    _topIndex++;
  }
  public boolean isEmpty(){
    if(_topIndex == 0)  return true;
    else return false;
  }
  public T top(){
    return _array[_topIndex -1];
  }
  public int size(){
    return _topIndex;
  }

  @SuppressWarnings("unchecked")
  private void expandArray(){
    _maxRaySize *= 2;
    T[] newArray = (T[]) new Object[_maxRaySize];
    for(int i = 0; i < _array.length; i++)
         newArray[i] = _array[i];
    System.out.println("Stack new size is " + _maxRaySize);
    _array = newArray;
  }
}
