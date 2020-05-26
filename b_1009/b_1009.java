package b_1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b_1009 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] x = new int[count];

        for(int i =0; i<count;i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            x[i]=1;

            for(int j=0;j<b;j++){
                x[i]=x[i]*a%10;
            }
            if(x[i]==0){
                x[i]=10;
            }
        }

        for(int i =0; i<count;i++){
            System.out.println(x[i]);
        }
    }
}