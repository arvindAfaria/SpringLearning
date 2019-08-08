package com.afaria.spring.springcore.dependency;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String patName;
	private List<String> meds;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public List<String> getMeds() {
		return meds;
	}

	public void setMeds(List<String> meds) {
		this.meds = meds;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patName=" + patName + ", meds=" + meds + "]";
	}

}
