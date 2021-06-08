package com.day.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import com.day.dto.Customer;
import com.day.dto.Product;
import com.day.exception.AddException;
import com.day.exception.FindException;
import com.day.exception.ModifyException;
import com.day.sql.Myconnection;

public class CustomerDAOOracle implements CustomerDAO {

	public CustomerDAOOracle() throws Exception {
		// JDBC연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("JDBC연결 성공");
	}

	@Override
	public void insert(Customer c) throws AddException {
		Connection con = null;

		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AddException(e.getMessage());
		}

		String insertSQL = "INSERT INTO customer(id, pwd, name) VALUES (?, ?, ?)";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = con.prepareStatement(insertSQL);
			pstmt.setString(1, c.getId());
			pstmt.setString(2, c.getPwd());
			pstmt.setString(3, c.getName());

			rs = pstmt.executeQuery();
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new AddException(e.getMessage());
		} finally {
			Myconnection.close(con, pstmt, rs);
		}

	}

	@Override
	public Customer selectById(String id) throws FindException {
		Connection con = null;

		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String selectById = "SELECT * FROM customer WHERE id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Customer c = null;

		try {
			pstmt = con.prepareStatement(selectById);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String id2 = rs.getString("id");
				String pwd2 = rs.getString("pwd");
				String name2 = rs.getString("name");
				String buildingno2 = rs.getString("bulidingno");
				int enabled2 = rs.getInt("enabled");
				c = new Customer(id2, pwd2, name2, buildingno2, enabled2);
			} else {
				throw new FindException("아이디가 존재하지 않습니다");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new FindException(e.getMessage());
		} finally {
			Myconnection.close(con, pstmt, rs);
		}

		return c;
	}

	@Override
	public void update(Customer c) throws ModifyException {
		Connection con = null;

		try {
			con = Myconnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String updateSQL = "UPDATE customer SET pwd = ?, name = ?, buildingno = ?, enabled = ? WHERE id = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = con.prepareStatement(updateSQL);
			pstmt.setString(1, c.getPwd());
			pstmt.setString(2, c.getName());
			pstmt.setString(3, c.getBuildingno());
			pstmt.setInt(4, c.getEnabled());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ModifyException(e.getMessage());
		} finally {
			Myconnection.close(con, pstmt, rs);
		}
	}

}
