public class Mergesort {
    public static int count = 0;
    public static void conqure(int []arr, int si, int mid, int ei){
        int [] merged = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0; 
        while (indx1 <= mid && indx2 <= ei)   {
            if(arr[indx1] <= arr[indx2]){
                merged[x++] = arr[indx1++];
            }
            else{
                merged[x++] = arr[indx2++];
                count += (mid - indx1+1);
            }
        }
        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }
        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }
        for(int i=0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
        }
    public static void divide(int [] arr, int si, int ei){
        if(si>= ei){
            return;
        }
        int mid = si +(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conqure(arr,si,mid,ei);
    }
    
    public static void main(String[] args) {
        int [] arr = {3,4,2,1,8};
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " " );
        }
        System.out.println();
        System.out.println("the inversion count is:" + count);
    }
}
