import java.util.Comparator;
public class IntComparator implements Comparator<Integer>
{
@Override
public int compare(Integer pFirst, Integer pSecond)
{
  if(pFirst > pSecond)return 1;
  else if(pFirst == pSecond) return 0;
  else return -1;
}
}
