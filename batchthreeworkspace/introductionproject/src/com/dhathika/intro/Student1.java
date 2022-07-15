package com.dhathika.intro;

public class Student1 {
	
	String className;	
	int sId;
	long scontact;
	float percentage;
	char gender;
	public Student1(String className, int sId, long scontact, float percentage, char gender) {
		super();
		this.className = className;
		this.sId = sId;
		this.scontact = scontact;
		this.percentage = percentage;
		this.gender = gender;
	}
	public Student1() {
		super();
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public long getScontact() {
		return scontact;
	}
	public void setScontact(long scontact) {
		this.scontact = scontact;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student1 [className=" + className + ", sId=" + sId + ", scontact=" + scontact + ", percentage="
				+ percentage + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		result = prime * result + gender;
		result = prime * result + Float.floatToIntBits(percentage);
		result = prime * result + sId;
		result = prime * result + (int) (scontact ^ (scontact >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		if (gender != other.gender)
			return false;
		if (Float.floatToIntBits(percentage) != Float.floatToIntBits(other.percentage))
			return false;
		if (sId != other.sId)
			return false;
		if (scontact != other.scontact)
			return false;
		return true;
	}
	
	
	
 }
