package com.mavenproj;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayexpample {
	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,5,4,2};
		int[] arr1=new int[] {1,2,3};
		int c=0;
		int k=0;
		int[] temp =new int[arr.length];
		Arrays.sort(arr);
		System.out.println("arrlenth"+arr.length);
		
		for (int i=0;i<arr.length-1;i++) {
			
			int flag=0;
			for(int j=i;j<arr.length-1;j++) {
				if(arr[i]==arr[j+1]) {
					flag=1;
					c=c+1;
					
				}
				
			}
			if(flag==0) {
				temp[k]=arr[i];
				k++;
			}
			
		}
		
		for (int i=0;i<arr.length-c-1;i++) {
			arr[i]=temp[i];
			//System.out.println(arr.length);
			System.out.println(arr[i]);
		}
		String s="india is my country";
		System.out.println(s.contains("c"));
		System.out.println(s.substring(1,3));
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.compareToIgnoreCase("country"));
		System.out.println(s.compareTo("india is my country1212"));
		System.out.println(s.indexOf("i"));
		System.out.println(s.replaceFirst("i", "I"));
		char[] cchar=s.toCharArray();
		String tempstr = "";
		String tempstr1="";
		for(int i=0;i<cchar.length;i++) {
			if(tempstr1.indexOf(cchar[i])<0) {
				tempstr1=tempstr1+cchar[i];
				
			}
			if(!tempstr.contains(String.valueOf(cchar[i]))) {
				tempstr=tempstr+cchar[i];
				
			}
			
		}
		System.out.println(tempstr);
		System.out.println(tempstr1);
		
		
	}
	
	

}


