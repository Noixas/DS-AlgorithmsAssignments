import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class MergeSort
{
public static <T> List<T> Sort(List<T> pList, Comparator<T> pComparator){
        boolean bubbleSortEnabled = false;
        if(pList.size() <= 1) return pList;
        else if(bubbleSortEnabled && pList.size() < 20)
        return BubbleSort.sort(pList,pComparator);
        int midPoint = pList.size()/2;
        List<T> newA = new ArrayList<T>();
        List<T> newB = new ArrayList<T>();
        for(int i = 0; i < pList.size(); i++) {
                if(i < midPoint) newA.add(pList.get(i));
                else newB.add(pList.get(i));
        }
        newA = Sort(newA, pComparator);
        newB = Sort(newB, pComparator);

        return MergeLists(newA, newB, pComparator);

}
private static <T> List<T> MergeLists(List<T> pListA, List<T> pListB, Comparator<T> pComparator)
{
        List<T> out = new ArrayList<T>();
        while(pListA.size() > 0 && pListB.size() > 0)
        {
                if(pComparator.compare(pListA.get(0), pListB.get(0)) <= 0)
                {
                        out.add(pListA.get(0));
                        pListA.remove(0);
                }
                else
                {
                        out.add(pListB.get(0));
                        pListB.remove(0);
                }
        }
        if(pListA.size()>0)
        {
          for(int i = 0; i < pListA.size(); i++)
             {
             out.add(pListA.get(i));

             }
        }
        else{
                for(int i = 0; i < pListB.size(); i++)
                   {
                   out.add(pListB.get(i));
                   }
        }
        return out;
}
}
