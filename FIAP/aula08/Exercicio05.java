package fiap;

import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] nums = setNum();
		int[] nums2 = nums;
		nums = orderna(nums);
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(nums[i]);
		}
		
		nums2 = ordenaSelection(nums2);
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(nums2[i]);
		}	
		
	}
	
	public static int[] setNum() {
		int[] nums = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			nums[i] = sc.nextInt(); 
		}
		return nums;
	}
	
	//insertion
	public static int[] orderna(int[] nums) {
		
		for(int i = 1 ; i < nums.length ; i++) {
			int aux = nums[i];
			
			int j = i - 1;
			while(j >= 0 && aux < nums[j]) {
				nums[j + 1] = nums[j];
				
				j--;
			}
			nums[j + 1] = aux;
			
		}
		
		return nums;
	}
	
	//selection
	public static int[] ordenaSelection(int[] nums) {
		
		for(int i = 0 ; i < nums.length ; i++) {
			int min = 0;
			int temp = nums[i];
			
			int j = i;
			while(j < nums.length) {
				if(nums[min] > nums[j]) {
					min = j;
				}
				j++;
			}
			nums[i] = nums[min];
			nums[min] = temp; 
			
		}
		
		
		return nums;
	}
}
