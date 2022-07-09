package com.interview.basicMath;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateNoUsingStream {

	public static void main(String[] args) {
		
		Stream< Integer> stream = Stream.of(5, 13, 4,
                21, 13, 27,
                2, 59, 59, 34);
		
		Set<Integer> hashset = new HashSet<>();
		long c= stream.filter(n ->!hashset.add(n)).count();
		
		System.out.println(c);
	}
}
