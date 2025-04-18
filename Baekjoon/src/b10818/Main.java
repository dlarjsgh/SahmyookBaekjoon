package b10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
		
	    int N = Integer.parseInt(st.nextToken());
		int array[] = new int[N];

		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]<min) {
				min=array[i];
			}
		}	
		System.out.println(min+" "+max);
	}
}
