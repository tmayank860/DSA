package RandomProblems;

import java.lang.annotation.*;

interface StrFunc
{
    String disp(String n);
}

class MaxDistance
{
    public static void main(String args[])
    {
        StrFunc output = (str) -> {
            String result = "";
            int a;
            for(a = str.length()-1; a >= 0; a--)
                result += str.charAt(a);
            return result;
        };

        System.out.println(output.disp("HACKEREARTH"));
    }
}