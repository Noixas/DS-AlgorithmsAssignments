import java.util.List;
import java.util.Comparator;
public class BubbleSort{
public static <T> List<T> sort(List<T> pList, Comparator<T> pComparator ){
        if(pList.size() <= 1) return pList;
        T currentElement;
        T nextElement;
        int sorted = 0;
        for (int i = 1;i < pList.size() ; i++) {
            for (int j = 0;j < pList.size() - i ; j++) {
             currentElement = pList.get(j);
             nextElement = pList.get(j+1);
              if(pComparator.compare(currentElement, nextElement) > 0)
              {
                pList.set(j+1, currentElement);
                pList.set(j, nextElement);
                sorted++;
              }
            }
            if(sorted == 0) return pList;//If no swaps then is already ordered so return
            else sorted = 0;

        }
        return pList;

}

}
