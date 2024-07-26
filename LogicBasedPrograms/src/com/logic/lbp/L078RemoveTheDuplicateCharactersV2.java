package com.logic.lbp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L078RemoveTheDuplicateCharactersV2 {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(21);
		li.add(28);
		li.add(20);
		li.add(21);
		li.add(8);
		
		Stream<Integer> st=li.stream();
		st.filter(i->i % 2 ==0).forEach(System.out::println);
		
		Map<String,List<Integer>> mp=li.stream().collect(Collectors.groupingBy(
				i->i%2==0?"Evwn":"Odd"));
		System.out.println(mp);
	}
	public void m1() {
		
	}
public void m2() {
		m1();
	}
}
