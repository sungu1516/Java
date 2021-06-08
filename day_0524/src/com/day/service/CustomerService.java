package com.day.service;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.day.dao.CustomerDAO;
import com.day.dao.ProductDAOFile;
import com.day.dto.Customer;
import com.day.dto.Product;
import com.day.exception.AddException;
import com.day.exception.FindException;

public class CustomerService {
	private CustomerDAO dao;
	private static CustomerService service = new CustomerService(); // 싱글톤패턴. 외부에서 새로 객체를 만들 수 없도록.

	private CustomerService() {

		Properties env = new Properties();
		try {
			env.load(new FileInputStream("classes.prop"));
			String className = env.getProperty("customerDAO");
			Class c = Class.forName(className);
			dao = (CustomerDAO) c.newInstance();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

	static public CustomerService getInstance() { // 외부에서 호출할 수 있도록.
		return service;
	}

	public void signUp() throws AddException {

	}

}
