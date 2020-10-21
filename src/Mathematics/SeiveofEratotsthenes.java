package Mathematics;

public class SeiveofEratotsthenes {
    public static void main(String[] args) {
seive(100);
    }
   public static void seive(int n){
        int[] primes=new int[n+1];
        for (int i=0;i<=n;i++){
            primes[i]=1;
        }
        primes[0]=0;
        primes[1]=0;
        for (int i=2;i*i<=n;i++){
            if (primes[i]==1){
                for (int j=i*i;j<=n;j+=i){
                    primes[j]=0;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if (primes[i]==1){
                System.out.print(i+" ");
            }
        }
   }
}
