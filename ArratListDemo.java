package com.demo;

import java.util.ArrayList;

public class ArratListDemo {
	public static void main(String []args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		for(Integer i: list) {
			System.out.println(i);
		}
		System.out.println(list);
	}

}
