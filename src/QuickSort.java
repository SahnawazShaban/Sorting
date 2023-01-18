public class QuickSort {
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int x=low-1;

        for (int i=low;i<high;i++){
            if (arr[i] < pivot){
                x++;
                //swap
                int temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
            }
        }
        x++; //pivot+1 wale elements ko store karne ke liye
        int temp = arr[x];
        arr[x] = arr[high];
        arr[high] = temp;

        return x;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int pidx = partition(arr, low, high);

            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,5,1,2,8,4,9};
        int n = arr.length;

        //call function
        quickSort(arr,0,n-1);
        //print array
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
