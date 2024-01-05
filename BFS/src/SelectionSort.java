public class SelectionSort {
    public double[] selectionSort(double arr[]){
        double temp;
        for(int i = 0; i< arr.length; i++){
            int minIndex = i;
            for(int j = i +1; j< arr.length; j ++){
                if(arr[j] < arr[i]){
                    minIndex = j;
                }
            }

            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    
}
