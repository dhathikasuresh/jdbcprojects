package com.dhathika.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dhathika.dto.Address;
import com.dhathika.dto.Manifacturer;
import com.dhathika.dto.Product;
import com.dhathika.util.ConnectionUtil;

public class ProductDaoImpl implements ProductDao{
	Connection connection;
	ConnectionUtil connectionutil = new ConnectionUtil();

	@Override
	public void createProductDao(Product product)  {
		try {
			connection = connectionutil.getConnection();
			PreparedStatement pstmt = connection.prepareStatement("insert into product values(?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, product.getPid());
			pstmt.setString(2, product.getPname());
			pstmt.setDouble(3, product.getPprice());
			pstmt.setString(4, product.getPtype());
		    pstmt.setDouble(5, product.getPweight());
		    pstmt.setString(6, product.getManifacturer().getMname());
		    pstmt.setInt(7, product.getManifacturer().getAddress().getHno());
		    pstmt.setString(8, product.getManifacturer().getAddress().getStreet());
		    pstmt.setString(9, product.getManifacturer().getAddress().getCity());
		    pstmt.setString(10, product.getManifacturer().getAddress().getCountry());
		    pstmt.setInt(11, product.getManifacturer().getAddress().getPin());
		    pstmt.execute();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connectionutil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String updateProductDao(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product selectProductByPidDao(int pid) {
		Product prd = new Product();
		
		try {
			
			
		
			connection = connectionutil.getConnection();
			PreparedStatement pstmt = connection.prepareStatement("select * from PRODUCT where PID=?");
			pstmt.setInt(1, pid);
			
			ResultSet rs = pstmt.executeQuery();	
			rs.next();
			prd.setPid(rs.getInt(1));
			prd.setPname(rs.getString(2));
			prd.setPprice(rs.getDouble(3));
			prd.setPtype(rs.getString(4));
			prd.setPweight(rs.getDouble(5));
			
			// Create manifacturer 
			
			Manifacturer manifacturer = new Manifacturer();	
			manifacturer.setMname(rs.getString(6));
			
			// create address
			
			Address address = new Address();
			address.setHno(rs.getInt(7));
			address.setStreet(rs.getString(8));
			address.setCity(rs.getString(9));
			address.setCountry(rs.getString(10));
			address.setPin(rs.getInt(11));
			manifacturer.setAddress(address);
			prd.setManifacturer(manifacturer);
	
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prd;
	}

	@Override
	public List<Product> selectAllAvailableProductDao() {
		List<Product> prdList = new ArrayList<Product>();
		try {
			connection = connectionutil.getConnection();
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from PRODUCT");
		
			while(rs.next()) {
				
				Product prd = new Product();
				Manifacturer manifacturer = new Manifacturer();
				Address address = new Address();
				
				
				prd.setPid(rs.getInt(1));
				prd.setPname(rs.getString(2));
				prd.setPprice(rs.getDouble(3));
				prd.setPtype(rs.getString(4));
				prd.setPweight(rs.getDouble(5));
				manifacturer.setMname(rs.getString(6));
				address.setHno(rs.getInt(7));
				address.setStreet(rs.getString(8));
				address.setCity(rs.getString(9));
				address.setCountry(rs.getString(10));
				address.setPin(rs.getInt(11));
				manifacturer.setAddress(address);
				prd.setManifacturer(manifacturer);
				prdList.add(prd);
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prdList;
	}

	@Override
	public List<Product> selectAllProductsByPriceAscendingOrderDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> selectAllProductsByPriceDescendingOrderDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductDao() {
		// TODO Auto-generated method stub
		
	}

}
