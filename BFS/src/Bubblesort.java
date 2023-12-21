import java.math.*;
public class Bubblesort {

    public int[] bubbleSort(int arr[]){

        int temp;
        for(int i = 0; i< arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    
}


class BinarySearch {

    public int binarySearch(int arr[], int first,int last,int key){
        if(last >= first){
            int mid = Math.floorDiv((last + first), 2);
            if(arr[mid] == key){
                return mid;
            }
            else if(key > arr[mid]){
                return binarySearch(arr, mid +1, last, key);
            }
            else{
                 return binarySearch(arr, 0, mid - 1, key);
            }
        }else{
            return 0;
        }

    }

    
}
