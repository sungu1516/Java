package com.day.dao;

import java.util.List;

import com.day.dto.Customer;
import com.day.dto.Product;
import com.day.exception.AddException;
import com.day.exception.FindException;
import com.day.exception.ModifyException;

public interface CustomerDAO {
	/**
	 * 고객은 가입한다
	 * @param 고객의 customer 객체
	 * @return 없음
	 * @throws AddException 아이디 등 정보 추가시 발생
	 */
	public void insert(Customer c) throws AddException;

	/**
	 * 고객은 로그인한다. 자기정보를 조회한다.
	 * 
	 * @param id 로그인할 아이디
	 * @return id에 대응하는 customer 객체
	 * @throws FindException 해당 아이디가 존재하지 않을경우 발생
	 */
	public Customer selectById(String id) throws FindException;

	/**
	 * 고객은 자기 정보를 수정한다.
	 * 
	 * @param 고객의 customer 객체
	 * @return 없음
	 * @throws FindException 수정 실패 시 발생하는 예외
	 */
	public void update(Customer c) throws ModifyException;

}