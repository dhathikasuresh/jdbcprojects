package com.dhathika.comparators;

import java.util.Comparator;

import com.dhathika.dto.Product;

public class ProductIdComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getPid()<o2.getPid())	return -1;		
		else if(o1.getPid()>o2.getPid())return 1;
		else return 0;
		
	}

}
