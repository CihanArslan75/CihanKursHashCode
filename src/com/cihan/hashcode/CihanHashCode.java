package com.cihan.hashcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class CihanHashCode {
	
	public String getAsciiCode(String word) {
		List<char[]> wordList=Arrays.asList(word.toCharArray());
		char[] wordList1=word.toCharArray();
		
		int a = 0 ;
		String result = "";
		int sayi=0;
		for (char cs : wordList1) {
			if(sayi==0) 
			{
				a=randomNumber();
				result=String.valueOf(a);
				String hashString=String.valueOf(String.valueOf(cs).hashCode());
				for(int i=0;i<= 5- hashString.length() ;i++ ) {
					hashString=0+hashString;
				}
				result+=hashString;
				
			}
			else
			{
				a =  (int)cs * 55;
			}
			String aa= String.valueOf(a);
			
			for(int i=0;i<= 5- aa.length() ;i++ ) {
				aa=0+aa;
			}
			result+=aa;
			sayi++;
		}	
		return result;
	 
	}
	
	public int randomNumber() {
		Random rand = new Random(); 
		int min=10000;
		int max=99999;
		int x= (rand.nextInt((max - min) ) +min);
		return x;
	}
	
	public String decodeAlgrtm(String a) {
		String[] aa= a.split("(?<=\\G.....)");
		int number = 0;
		String word = "";
		for (int i=1;i<aa.length;i++) {
			if(i==1) {
				
			}
			else
			{
				number=Integer.valueOf(aa[i])/55;
			}
			word=word+(char) number;
		}
		return word;
	}
	

}
