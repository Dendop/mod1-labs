import java.util.LinkedList;

public class LinkedBench {

    public void loadAndSearch(int size) {
        long startAll = System.currentTimeMillis();

        LinkedList<Integer> myList = new LinkedList<>();
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

        System.out.println("Results for Linked:");
        System.out.println("Time for search -> Linked: " + (end - start) + " ms");
        System.out.println("Time to load and search -> Linked: " + (endAll - startAll) + " ms");
    }
}
