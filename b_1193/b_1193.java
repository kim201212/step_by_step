package b_1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1193 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count=1,temp=0;

        while(true){
            temp=temp+count;
            if(temp>=n){
                break;
            }
            count++;
        }

        int s = temp-n;

        if(count%2==1){
            for(int i=0;i<=s;i++){
                if(i==s){
                    System.out.println((i+1)+"/"+(count-i));
                }
            }
        }
        else{
            for(int i=0;i<=s;i++){
                if(i==s){
                    System.out.println((count-i)+"/"+(i+1));
                }
            }

        }
    }
}