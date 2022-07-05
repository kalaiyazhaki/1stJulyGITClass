package org.com;

public class SingleInheritance extends SingleChildClass  {
	
	private void tamilLanguage() {
		System.out.println("Tamil language: 25");

	}
	private void englishLanguage() {
		System.out.println("English language:15");
	}
	private void hindiLanguage() {
		System.out.println("Hindi language:10");
		
	}
	public static void main(String[] args) {
		SingleInheritance k = new SingleInheritance();
		k.tamilLanguage();
		k.englishLanguage();
		k.hindiLanguage();
		k.southIndia();
		k.northIndia();
		k.state();
		k.country();
}
}