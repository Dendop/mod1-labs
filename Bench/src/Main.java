//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedBench linkedBench = new LinkedBench();
        ArrayBench arrayBench = new ArrayBench();

        linkedBench.loadAndSearch(1000000);
        arrayBench.loadAndSearch(1000000);
    }
}