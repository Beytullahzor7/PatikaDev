import java.util.Scanner;
import java.util.*;
import java.io.*;

public class MathChallenge {
    String DivisionStringified(int num1, int num2) {
        Integer result = (int)Math.round(num1/(double)num2);
        String[] str = result.toString().split("");
        int count = 0;
        for(int i = str.length-2; i >= 0; i--){
            count++;
            if(count % 3 == 0){
                str[i] = str[i] + ",";
                count=0;
            }
        }
        String output = "";
        for(int i = 0; i < str.length; i++){
            output = output + str[i];
        }
        return output;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        MathChallenge c = new MathChallenge();
        System.out.println(c.DivisionStringified(123456789,1000));
    }
}
