package com.dhathika.hashmaps;

public class CityRank implements Comparable<CityRank>{
	
	int cityRank;
	String citysplName;
	public CityRank(int cityRank, String citysplName) {
	
		this.cityRank = cityRank;
		this.citysplName = citysplName;
	}
	@Override
	public String toString() {
		return "CityRank [cityRank=" + cityRank + ", citysplName=" + citysplName + "]";
	}
	@Override
	public int compareTo(CityRank o) {
		if(this.cityRank<o.cityRank) {
			return -1;
	}
		else if(this.cityRank>o.cityRank) {
			return +1;
		}
		else {
			return 0;
		}
		 
	}
	
	

}
