package com.dhathika.arraylists;

public class Student implements Comparable<Student>{
	
	private int stdNum;
	private String stdName;
	private String stdAddress;
	
	public Student(int num, String name, String address) {
		stdNum = num;
		stdName = name;
		stdAddress = address;
	}

	public int getStdNum() {
		return stdNum;
	}

	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + ", stdAddress=" + stdAddress + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stdAddress == null) ? 0 : stdAddress.hashCode());
		result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
		result = prime * result + stdNum;
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
		Student other = (Student) obj;
		if (stdAddress == null) {
			if (other.stdAddress != null)
				return false;
		} else if (!stdAddress.equals(other.stdAddress))
			return false;
		if (stdName == null) {
			if (other.stdName != null)
				return false;
		} else if (!stdName.equals(other.stdName))
			return false;
		if (stdNum != other.stdNum)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
	      if(this.stdNum>o.stdNum) {
	    	  return -1;
	      }else if(this.stdNum<o.stdNum) {
	    	  return +1;
	      }
	      else {
	    	  return 0;
	      }
		
	}
}

	
