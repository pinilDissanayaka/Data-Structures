public class Main {

    public static void main(String[] args) {
        double arr[] = {1, 10, 2, 5, 3};

        InsertionSort i = new InsertionSort();

        double sortedArr[] = i.insertionSort(arr);

        for(int k = 0; k< sortedArr.length; k++){
            System.out.println(sortedArr[k]);
        }
    }
    
}
