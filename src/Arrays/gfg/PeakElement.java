package Arrays.gfg;

public class PeakElement {
    public static void main(String[] args) {

    }
    public int peakElement(int[] a,int n)
    {
        //add code here.
        int i=0;
        if (a[0]>a[1]){
            return 0;
        }
        if (a[n-1]>a[n-2]){
            return n-1;
        }
        for (i=1;i<n-1;i++){
            if (a[i-1]<a[i]&&a[i]>a[i+1]){
                    return i;
                }
        }
        return -1;
    }
}
