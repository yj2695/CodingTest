import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] arr = new int[n];
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			if(arr[i]<x) answer.add(arr[i]);
		}
		
		for(int i : answer) {
			System.out.print(i+" ");
		}
	}
}