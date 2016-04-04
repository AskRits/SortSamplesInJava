import java.util.ArrayList;

/**
 * Created by Ritesh on 4/4/2016.
 */
public class QuickSortSample {
    QuickSortSample(){
    }
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<Integer>() {{
                add(new Integer(120)); add(new Integer(45)); add(new Integer(2)); add(new Integer(90)); add(new Integer(78));
        }};
        QuickSortSample qs = new QuickSortSample();
        System.out.println("to be sorted:"+numbers);
        ArrayList<Integer> sortedNumbers = qs.doSort(numbers);
        System.out.println("sorted:"+sortedNumbers);
    }

    /**
     * This is recursive function to perform quicksort
     * A
     * @param numbers
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> doSort(ArrayList<Integer> numbers){
        // Stop recursion when only 1 is left.
        if( (numbers==null) || (numbers.size() <= 1))
            return numbers;
        // Declare/Create new arrays
        ArrayList<Integer> lower  = new ArrayList<Integer>();
        ArrayList<Integer> higher = new ArrayList<Integer>();
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        // using first number as the pivot
        Integer pivot= numbers.remove(0);
        // put numbers in lower and higher arrays
        numbers.forEach(i -> {
            if (i.intValue() < pivot.intValue())
                lower.add(i);
            else
                higher.add(i);
        });
        sorted.addAll(doSort(lower));
        sorted.add(pivot);
        sorted.addAll(doSort(higher));

        return sorted;
    }

}
