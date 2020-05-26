package b_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class b_2750 {
   public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int number = Integer.parseInt(br.readLine());
        int[] num = new int[number];

        for(int i = 0; i<num.length;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        for(int i = 0; i<num.length;i++){
            System.out.println(num[i]);
        }
   }
}