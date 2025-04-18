package b2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int num = 0;
    int M = 0;

    for(int i=0; i<N; i++){
        num = i;
        int sum = 0;

        while(num != 0){
            sum += num % 10;
            num /= 10;
        }       
        if(sum + i == N){
            M = i;
            break;
        }
    }
    System.out.println(M);
    br.close();
    }
}