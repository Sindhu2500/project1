package task;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		int n=5;
		int count=0;
		int arr[]=new int[n/2];
		int x=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				arr[x]=n/i;
				x++;
			}
			
		}
		System.out.println(count);
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
