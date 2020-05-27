package b_10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10870{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] n = new int[num+1];
        
            for(int i=0;i<=num;i++){
                if(i==0){n[i]=0;}
                else if(i==1){n[i]=1;}
                else{
                n[i]=n[i-1]+n[i-2];
            }
        }
        System.out.println(n[num]);
    }
    
}