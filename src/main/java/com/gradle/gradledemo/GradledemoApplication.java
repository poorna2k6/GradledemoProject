package com.gradle.gradledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Optional;

@SpringBootApplication
public class GradledemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradledemoApplication.class, args);
		System.out.println(twoSum(new int[] {2, 7, 11, 15},9));
	}

	public static int[] twoSum(int[] nums, int target) {
		if(nums==null || nums.length<2)
			return new int[]{0,0};

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++){
			if(map.containsKey(nums[i])){
				return new int[]{map.get(nums[i]), i};
			}else{
				map.put(target-nums[i], i);
			}
		}
		String[] str = new String[10];
		Optional<String> checkNull =
				Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String word = str[5].toLowerCase();
			System.out.print(str);
		} else
			System.out.println("string is null");
		return new int[]{0,0};
	}

}
