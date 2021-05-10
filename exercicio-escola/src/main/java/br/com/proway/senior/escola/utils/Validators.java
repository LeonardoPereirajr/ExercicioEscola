package br.com.proway.senior.escola.utils;


public class Validators {
	
	private Validators() {}
	

	static public boolean onlyValidChars(String verify) {
		return !verify.matches(
				".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+.*");
	}
}
