package GFGAmazon.Sorting;

public class InversionofArray {
    public static void main(String[] args) {
        long[] arr={2, 4, 1, 3, 5};
System.out.println(inversionCount(arr,5));
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergeSort(arr,0,N-1);
    }
    static long mergeSort(long[] arr,long left,long right){
        long inversion=0;
        if (left<right){
            long mid=left+(right-left)/2;
            inversion+=mergeSort(arr,left,mid);
            inversion+=mergeSort(arr,mid+1,right);
            inversion+=merge(arr,left,mid,right);
        }
        return inversion;
    }
    static long merge(long[] arr,long left,long mid,long right){
        long i,j,k,count=0;
        long n1=mid-left+1;
        long n2=right-mid;
        long[] L=new long[(int) n1];
        long[] R=new long[(int) n2];
        for (i = 0; i < n1; i++) {
            L[(int) i] = arr[(int) (left + i)];
        }
        for (j = 0; j < n2; j++) {
            R[(int) j] = arr[(int) (mid + 1 + j)];
        }
        i = 0;
        j = 0;
        k = left;
        while (i < n1 && j < n2) {
            if (L[(int) i] <= R[(int) j]) {
                arr[(int) k] = L[(int) i];
                i++;
            } else {
                arr[(int) k] = R[(int) j];
                j++;
                count+=mid+1-(left+i);
            }
            k++;
        }
        while (i < n1) {
            arr[(int) k] = L[(int) i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[(int) k] = R[(int) j];
            j++;
            k++;
        }

        return count;
    }
}
