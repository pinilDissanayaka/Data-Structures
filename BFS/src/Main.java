public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 10, 2, 5, 3};

        Bubblesort b = new Bubblesort();

        arr = b.bubbleSort(arr);

        BinarySearch bi = new BinarySearch();

        System.out.println(bi.binarySearch(arr, 0, arr.length - 1, 10));
    }
    
}
