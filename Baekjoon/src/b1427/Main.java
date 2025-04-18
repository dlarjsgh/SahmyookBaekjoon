package b1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		int slength = s.length();
		int[] array = new int[slength];
		
		for(int i=0; i<slength; i++) {
			array[i] = s.charAt(i);
		}
		
		Arrays.sort(array);
		
		for(int i=slength-1; i>=0; i--) {
			sb.append(array[i]-48);
		}
		
		System.out.print(sb);
	}
}