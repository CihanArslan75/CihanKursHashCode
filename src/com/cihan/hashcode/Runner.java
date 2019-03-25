package com.cihan.hashcode;

public class Runner {

	public static void main(String[] args) {
		CihanHashCode c = new CihanHashCode();
		String a=c.getAsciiCode("atilla");
		System.out.println(a);

		
		System.out.println(c.decodeAlgrtm(a));
		//String a="a";
		//System.out.println("aaa:"+	c.randomNumber());
		//System.out.println("a:"+	a.hashCode());
	}

}
