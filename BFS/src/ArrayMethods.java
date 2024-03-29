class ArrayMethods {
    //insertion
    public int[] insertion(int arr[], int index, int element){
        arr[index] = element;
        return arr;
    }

    //traversal
    public void traversal(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " , ");
        }
    }

    //deletion
    public int[] deletion(int arr[], int index){
        if(index < arr.length){
            for(int i = index; i < arr.length -1; i++){
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
    //Search in array
    //Linear search
    public void linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Element was found..");
                return;
            }
        }
        System.out.println("Element was not found..");
        return;
    }



    //Binary Search
    public void binarySearch(int arr[], int key){
        int retured = binary_Search(arr, arr[0], arr[arr.length-1], key);
        if(retured == 0){
            System.out.println("Can not find elemnt...");
        }else{
            System.out.println("Element found..");
        }
    }

    private int binary_Search(int arr[], int first,int last,int key){
        if(last >= first){
            int mid = Math.floorDiv((last + first), 2);
            if(arr[mid] == key){
                return mid;
            }
            else if(key > arr[mid]){
                return binary_Search(arr, mid +1, last, key);
            }
            else{
                    return binary_Search(arr, 0, mid - 1, key);
            }
        }else{
            return 0;
        }
    }
}
