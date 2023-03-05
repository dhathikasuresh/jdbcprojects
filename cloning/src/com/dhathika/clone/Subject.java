package com.dhathika.clone;

import java.io.Serializable;

public class Subject implements Cloneable,Serializable {
        String sub1;
        String sub2;
        String sub3;
		@Override
		public String toString() {
			return "Subject [sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
		}
        
		@Override
		protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		}
}
