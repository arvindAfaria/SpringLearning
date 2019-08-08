package com.afaria.spring.springcore.reftypes;

public class Scores {

	private Double maths;
	private Double physics;
	private Double chem;

	public Double getMaths() {
		return maths;
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChem() {
		return chem;
	}

	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", chem=" + chem + "]";
	}

	public void setChem(Double chem) {
		this.chem = chem;
	}

}
