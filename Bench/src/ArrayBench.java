import java.util.ArrayList;

public class ArrayBench {
    public void loadAndSearch(int size) {
        long startAll = System.currentTimeMillis();

        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            myList.add(i);
        }

        long start = System.currentTimeMillis();


        for (int x : myList) {
            if (x == 999_999) {

                break;
            }
        }

        long end = System.currentTimeMillis();
        long endAll = System.currentTimeMillis();

        System.out.println("Results for Array:");
        System.out.println("Time for search -> Array: " + (end - start) + " ms");
        System.out.println("Time to load and search -> Array: " + (endAll - startAll) + " ms");
    }
}
