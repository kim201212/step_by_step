package b_10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] input = new char[5][15];
        String temp;

        for(int i = 0; i < 5; i++) {
            temp = br.readLine();
            for(int j = 0; j < temp.length(); j++){
                input[i][j] = temp.charAt(j);
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(input[j][i]!='\0'){
                    System.out.print(input[j][i]);
                }
            }
        }

    }
}