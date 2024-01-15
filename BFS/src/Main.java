public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 10, 2, 5, 3};

        ArrayMethods a = new ArrayMethods();

        int sortedArr[] = a.deletion(arr, 2);

        for(int k = 0; k< sortedArr.length; k++){
            System.out.print(sortedArr[k] );
        }
    }
    
}
