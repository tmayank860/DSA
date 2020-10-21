package RandomProblems;

public class JumpingOnCloud {
    public static void main(String[] args) {
        int [] arr={0,0,0,1,0,0};
        System.out.println(jumpingOnClouds(arr));
    }

    static int jumpingOnClouds(int[] c) {
        int jump=0,i=0;
        while(i<c.length-1){
            if(i<c.length-2&&c[i]==0&&c[i+2]==0){
                jump++;
                i=i+2;
            }else if(c[i]==0&&c[i+1]==0){
                jump++;
                i++;
            }
        }
        return jump;
    }
}
