package b_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2798 {
    public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int max = 0;
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] card = new int[n];
        for(int i =0;i<n;i++){
            card[i]=Integer.parseInt(st2.nextToken());
        }
        
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i!=j){
                    for(int k =0;k<n;k++){
                        if(i!=k&&j!=k){
                            int a = card[i]+card[j]+card[k];
                            if(m>=a&&max<a)
                            max = a;
                        }
                    }   
                }
            }
        }
    System.out.println(max);
    }
}