package Mathematics;

public class LCMGCD {
    public static void main(String[] args) {
System.out.println("GCD or HCF :- "+gcd(4,6));
System.out.println("LCM:- "+(4*6)/gcd(4,6));
long result=1,lcm=0;
for(int i=2;i<=25;i++){
     result=result*i/gcd(i,  result);
//    result=gcd(i,result);
}
System.out.println(result);
    }
    static long gcd(long a, long b){
        if (a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
