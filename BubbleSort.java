import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Ritesh on 4/4/2016.
 */
public class BubbleSort {
    public BubbleSort() {
    }
    public static void main(String[] args){
        LinkedList<Integer> sortlist = new LinkedList<Integer>() {{
            add(new Integer(55));
            add(new Integer(20));
            add(new Integer(30));
            add(new Integer(301));
            add(new Integer(130));
            add(new Integer(205));
            add(new Integer(45));
            add(new Integer(90));
        }};
        System.out.println(sortlist);
        BubbleSort bs= new BubbleSort();
        LinkedList<Integer> sorted = bs.doSort(sortlist);
        System.out.println(sorted);
        
    }

    public LinkedList<Integer> doSort(LinkedList<Integer> sortlist){
        boolean isSwapped= false;
        int size = sortlist.size();
        try {

            do {
                isSwapped = false;
                int i = 0;
                while (i < size - 1) {
                    if (sortlist.get(i) > sortlist.get(i + 1)) {
                        // Swap
                        Collections.swap(sortlist, i, i + 1);
                        isSwapped = true;
                    }
                    i++; // keep moving down/sinking
                }
                size--; // optimization
            }
            while (isSwapped);

        }
        catch(IndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        return sortlist;
    }
    
}
