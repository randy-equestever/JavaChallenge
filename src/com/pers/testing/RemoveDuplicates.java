package com.pers.testing;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str1 = "John is playing flute with John himself";
		
		String str[] = str1.split(" ");
		
		Arrays.sort(str);
		
		for (String temp: str) {
			System.out.println(temp);
		}
		
		for (int i=1; i < str.length;i++) {
			if (str[i].equals(str[i-1])) {
				str[i] = "";
			}
		}
	}

}
