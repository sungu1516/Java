package com.day.dao;

import java.util.List;
import com.day.dto.Product;
import com.day.exception.FindException;

public interface ProductDAO {

	/**
	 * ��ǰ ��ü�� �˻��Ѵ�.
	 * @return ��ǰ ��ü�� ��ȯ
	 * @return FindException ��ǰ�� �������� �ʴ� ��� �Ǵ� ��ǰã�⸦ ������ ��� �߻��Ѵ�.
	 */	
	public List<Product> selectAll() throws FindException;
	
	/**
	 * ��ǰ�������� �˻��Ѵ�.
	 * @param currentPage ������
	 * @return �������� �ش��ϴ� ��ǰ���� ��ȯ
	 * @throws FindException ��ǰ�� �������� �ʴ� ��� �Ǵ� ��ǰã�⸦ ������ ��� �߻��Ѵ�.
	 */
	public List<Product> selectAll(int currentPage) throws FindException;
	
	/**
	 * ��ǰ��ȣ�� �˻��Ѵ�. 
	 * @param prod_no ��ǰ��ȣ
	 * @return ��ǰ��ȣ�� �ش��ϴ� ��ǰ�� ��ȯ
	 * @throws FindException ��ǰ�� �������� �ʴ� ��� �Ǵ� ��ǰã�⸦ ������ ��� �߻��Ѵ�.
	 */
	public Product selectByNo(String prod_no);
	
	/**
	 * ��ǰ������ �˻��Ѵ�.
	 * @param word ��ǰ�� �ش��ϴ� �ܾ�
	 * @return �ܾ ������ ��ǰ�� ��ȯ
	 * @throws FindException ��ǰ�� �������� �ʴ� ��� �Ǵ� ��ǰã�⸦ ������ ��� �߻��Ѵ�.
	 */
	public List<Product> selectByName(String word);

}
