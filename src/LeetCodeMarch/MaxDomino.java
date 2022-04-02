package LeetCodeMarch;

import java.util.Arrays;

public class MaxDomino {
    public static void main(String[] args) {
        int[] tops = {3,5,1,2,3};
        int[] bottoms = {3,6,3,3,4};
        System.out.println(minDominoRotations(tops, bottoms));
    }

    //    tops = [2,1,2,4,2,2], bottoms = [5,2,6,2,3,2]
    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int swapCount = 0;
        int startTop = tops[0], startBottom = bottoms[0];
        for (int i = 1; i < tops.length; i++) {
            if (tops[i] != startTop && bottoms[i] != startTop) {
                startTop = -1;
            }
            if (tops[i] != startBottom && bottoms[i] != startBottom) {
                startBottom = -1;
            }
        }
        if (startBottom == -1 && startTop == -1) {
            return -1;
        }
        int swapWith=startTop==-1?startBottom:startTop;
        int bswap=0,tswap=0;
        for (int i=0;i<tops.length;i++){
            if (swapWith!=tops[i]){
                tswap++;
            }
            if (swapWith!=bottoms[i]){
                bswap++;
            }
        }
        return Math.min(bswap,tswap);
    }
}
