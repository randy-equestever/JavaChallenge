package com.pers.testing;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicateText {

	public static void main(String[] args) {
		String str1= "John is always John and want to be always John";
		String[] array = str1.split(" ");
		List<String> list = Arrays.asList(array);
		List<String> list = Arrays.as
		Set<String> set = new LinkedHashSet(list);
		System.out.println("\""+str1 +"\" after removing duplicates :");
		for(String s: set) {
		System.out.print(s +" ");
		}
	}

}
