public class MergeSort {
    public static void conquer(int[] arr,int s,int mid,int e){
        int[] mergeSort = new int[e-s+1];
        int idx1 = s;
        int idx2 = mid+1;
        int x=0;

        while (idx1 <= mid && idx2 <= e){
            if (arr[idx1] <= arr[idx2]){
                mergeSort[x++] = arr[idx1++];
            }
            else {
                mergeSort[x++] = arr[idx2++];
            }
        }

        //if sub-array part is greater than other part, so add those element into mergeSort array
        while (idx1 <= mid){
            mergeSort[x++] = arr[idx1++];
        }

        while (idx2 <= e){
            mergeSort[x++] = arr[idx2++];
        }

        // copy all mergeSort array to arr array

        for (int i=0,j=s;i<mergeSort.length;i++,j++){
            arr[j] = mergeSort[i];
        }
    }
    public static void divide(int[] arr,int s,int e){
        //base condition
        if (s >= e){
            return;
        }
        int mid = s + (e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr,0,n-1);

        //print array
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
