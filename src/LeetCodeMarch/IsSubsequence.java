package LeetCodeMarch;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("rjufvjafbxnbgriwgokdgqdqewn",
                "mjmqqjrmzkvhxlyruonekhhofpzzslupzojfuoztvzmmqvmlhgqxehojfowtrinbatjujaxekbcydldglkbxsqbbnrkhfdnpfbuaktupfftiljwpgglkjqunvithzlzpgikixqeuimmtbiskemplcvljqgvlzvnqxgedxqnznddkiujwhdefziydtquoudzxstpjjitmiimbjfgfjikkjycwgnpdxpeppsturjwkgnifinccvqzwlbmgpdaodzptyrjjkbqmgdrftfbwgimsmjpknuqtijrsnwvtytqqvookinzmkkkrkgwafohflvuedssukjgipgmypakhlckvizmqvycvbxhlljzejcaijqnfgobuhuiahtmxfzoplmmjfxtggwwxliplntkfuxjcnzcqsaagahbbneugiocexcfpszzomumfqpaiydssmihdoewahoswhlnpctjmkyufsvjlrflfiktndubnymenlmpyrhjxfdcq"));
    }
    public static boolean isSubsequence(String s, String t) {
            int j=0;
            for (int i=0;i<t.length()&& j<s.length();i++){
                if (s.charAt(j)==t.charAt(i)){
                    j++;
                }
            }
            return j==s.length();
    }

    public static boolean sequence(String s,String t,int idx,String seq){
        if (idx==t.length()){
            if (seq.equals(s)){
                return true;
            }
            return false;
        }
       if (sequence(s,t,idx+1,seq+t.charAt(idx))==true){
           return true;
       }
         if (sequence(s,t,idx+1,seq)==true){
             return true;
         }
        return false;
    }

}
