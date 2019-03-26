package com.cihan.hashcode;

import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collectors;

public class CihanHashCode {
	
	private String result="";
	
	public String getAsciiCode(String word) {
		DecimalFormat myFormatter = new DecimalFormat("00000");
		
		List<Character> wordList = word.chars().mapToObj(e->(char)e).collect(Collectors.toList()); 
		
		wordList.stream().map(d->(int)d*55 ).forEach(d-> {
			String aa= String.valueOf(myFormatter.format(d));
	   		result+=aa;
		});
		return  result;
	 }
	
	public String decodeAlgrtm(String a) {
		String[] aa= a.split("(?<=\\G.....)");
		int number = 0;
		String word = "";
		for (int i=0;i<aa.length;i++) {
			number=Integer.valueOf(aa[i])/55;
			word=word+(char) number;
		}
		return word;
	}
	

}
