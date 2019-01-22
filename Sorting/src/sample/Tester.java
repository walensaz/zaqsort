package sample;

public class Tester {
    public static void main(String[] args) {
        /*NumArray numArray = new NumArray(100000);
        numArray.fillArray();
        numArray.listArray();
        System.out.println("---------------");
        numArray.Sort();
        System.out.println("First Array:");
        numArray.listArray();*/

        NumArray numArray = new NumArray(100000);
        numArray.fillArray();
        numArray.listArray();
        System.out.println("" +
                "\nSplitting Array!!!!");
        numArray.splitArray();
        numArray.mergeSort();
        numArray.listArrays();
        System.out.println(" ");
        System.out.println("My Array:");
        numArray.listArray();

        System.out.println(" ");
        //numArray.printSortTime("Sort");
        numArray.printSortTime("SortAll");

    }

}
