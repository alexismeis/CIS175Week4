package model;

import java.time.Year;

/**
 * @author alexismeis - aameis
 * CIS175 - Fall 2022
 * Oct 1, 2022
 */
public class AgeCalculator {
	private int currentYear = Year.now().getValue();
	private int dob;
	private int currentAge;
	
	public AgeCalculator() {
		super();
	}

	public AgeCalculator(int dob) {
		super();
		this.dob = dob;
		setAge(dob);
	}
	
	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public int getCurrentAge() {
		return currentAge;
	}

	public void setCurrentAge(int currentAge) {
		this.currentAge = currentAge;
	}

	public void setAge(int dob) {
		setCurrentAge(currentYear - dob);
	}

	@Override
	public String toString() {
		return "AgeCalculator [currentYear=" + currentYear + ", dob=" + dob + ", currentAge=" + currentAge + "]";
	}
	
	
}
