public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 10, 2, 5, 3};

        Bubblesort b = new Bubblesort();

        arr = b.bubbleSort(arr);

        for(int i=0;i < arr.length;i++ ){
            System.out.print(arr[i]+", ");
        }

    }
    
}
