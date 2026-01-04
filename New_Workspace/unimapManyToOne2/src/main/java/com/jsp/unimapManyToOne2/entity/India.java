package com.jsp.unimapManyToOne2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class India {

	@Id
	private int countryCode;
	private int independence;
	
	public India() {

	}

	public India(int countryCode, int independence) {
		this.countryCode = countryCode;
		this.independence = independence;
	}

	@Override
	public String toString() {
		return "India [countryCode=" + countryCode + ", independence=" + independence + "]";
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public int getIndependence() {
		return independence;
	}

	public void setIndependence(int independence) {
		this.independence = independence;
	}
	
}
