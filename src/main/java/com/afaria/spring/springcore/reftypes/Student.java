package com.afaria.spring.springcore.reftypes;

public class Student {

	private Scores scoresVar;

	
	public Scores getScoresVar() {
		return scoresVar;
	}


	public void setScoresVar(Scores scoresVar) {
		this.scoresVar = scoresVar;
	}

	@Override
	public String toString() {
		return "Student [scoresVar=" + scoresVar + "]";
	}
}
