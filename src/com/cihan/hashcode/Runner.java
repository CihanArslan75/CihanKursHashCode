package com.cihan.hashcode;

public class Runner {

	public static void main(String[] args) {
		CihanHashCode c = new CihanHashCode();
		String a=c.getAsciiCode("Cihan Arslan 1974 Elbistan");
		System.out.println(a);
		System.out.println(c.decodeAlgrtm(a));
	}

}
