package b_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1100 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt =0;
        String state;

        for(int i=0;i<8;i++){
            if(i%2==0){
                state=br.readLine();
                for(int j=0;j<8;j++){
                    if(j%2==0&&state.charAt(j)=='F'){cnt++;}
                }
            }
            else{
                state=br.readLine();
                for(int j=0;j<8;j++){
                    if(j%2==1&&state.charAt(j)=='F'){cnt++;}
                }
            }
        }    
        System.out.println(cnt);
    }
}