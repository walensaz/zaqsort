package sample;

public class Sorter implements Runnable{

    private int[] array;

    public Sorter(int[] array) {
        this.array = array;
    }

    public void run() {
        sort(array);
    }


    public void sort(int[] array) {

        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        quickSort(array,0, length - 1);
    }

    private void quickSort(int[] ary, int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        int pivot = ary[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            while (ary[i] < pivot) {
                i++;
            }
            while (ary[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(ary, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(ary, lowerIndex, j);
        if (i < higherIndex)
            quickSort(ary, i, higherIndex);
    }

    private void exchangeNumbers(int[] ary, int i, int j) {
        int temp = ary[i];
        ary[i] = ary[j];
        ary[j] = temp;
    }



}
