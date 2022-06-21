package koreait.day13a;

import java.util.Arrays;
// 작성자 김동규
public class C57_ArraySortEx {

		// 배열에 저장된 값 정렬하기 정령 구현하세요.
	public static void main(String[] args) {
		int temp;
		int [] nums = {3,5,43,27,66,12,1};
		 
//		for(int i = 0; i<nums.length-1;i++) {
//			for(int k =i+1; k<nums.length;k++) {
				for(int i = 0; i<nums.length -2;i++) {
					for(int k =i+1; k<nums.length-1 ;k++) {
				if(nums[i] > nums[k]) { 
					temp = nums[i];	
					nums[i] =  nums[k];
					nums[k] = temp;
				}
			
			}
		} // for
		System.out.println(Arrays.toString(nums));
	}

}
