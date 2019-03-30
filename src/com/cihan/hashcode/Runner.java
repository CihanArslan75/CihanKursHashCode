package com.cihan.hashcode;

public class Runner {

	public static void main(String[] args) {
		CihanHashCode c = new CihanHashCode();
		String a=c.getAsciiCode("Cihan Arslan 1974 Elbistan");
		System.out.println(a);
		System.out.println(c.decodeAlgrtm(a));
	}

}

//0368505775057200533506050017600357506270063250594005335060500176002695031350302502860017600379505940053900577506325063800533506050