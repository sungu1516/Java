package com.day.front;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.day.dto.Product;
import com.day.exception.FindException;
import com.day.service.ProductService;

public class Main {
	private Map<Product, Integer> cart;
	private ProductService service;
	private Scanner sc = new Scanner(System.in);

	public Main() {
		cart = new HashMap<>();
		// service = new ProductService();
		service = ProductService.getInstance();
		String line = "quit";

		do {
			if (line.equals("1")) {
				viewCart();
			} else {
				list();
			}

			System.out.println("�۾�����: 1. ��ٱ��� ����, ����. ��ǰ���, quit. ����");
			line = sc.nextLine();
		} while (!line.equals("quit"));

	}

	public void viewCart() {
		System.out.println("��ٱ��� ����");
		Set<Product> keys = cart.keySet(); // ���� Ű��
		for (Product p : keys) {
			int quantity = cart.get(p);// Ű�� �ش��ϴ� value ���
			System.out.println(p.getProd_no() + ":" + p.getProd_name() + ":" + p.getProd_price() + ":"
					+ p.getProd_detail() + ":" + quantity);
		}
	}

	public void info(Product p) {
		System.out.println(p.getProd_no());
		System.out.println(p.getProd_name());
		System.out.println(p.getProd_price());
		System.out.println(p.getProd_mf_dt());
		System.out.println(p.getProd_detail());

		int quantity;
		while (true) {
			System.out.println("-------------------------");
			System.out.println("������ �Է��ϼ��� : ");
			String line = sc.nextLine();
			try {
				quantity = Integer.parseInt(line);
				break;
			} catch (NumberFormatException e) {
				System.out.println("������ ���ڷθ� �Է��ϼ���");
			}
		}

		System.out.println("��ٱ��Ͽ� �߰��Ϸ��� y��, �����Ϸ��� n�� �Է��ϼ���");
		String line = sc.nextLine();
		if (line.equals("y")) {
			// ��ٱ��Ͽ� �߰�
			// ���� ��ǰ�� ������ ��� ������ �����ϰ�
			// ���� ��ǰ�� �������� ���� ��� ��ٱ��Ͽ� ��ǰ�� ������ �߰��Ѵ�.
			Integer oldQuantity = (Integer) cart.get(p);

			if (oldQuantity != null) { // ���� ��ǰ�� ������ ���
				quantity += oldQuantity; // ���� ����
			}

			cart.put(p, quantity);
			System.out.println("��ٱ��Ͽ� �߰��Ǿ����ϴ�");
		}

		System.out.println("-------------------------");

	}

	public void list() {
		try {
			List<Product> all = service.findAll();
			int index = 1;
			for (Product p : all) {
				System.out.println(index + ". " + p.getProd_no() + ":" + p.getProd_name() + ":" + p.getProd_price());
				index++;
			}
			System.out.println("-------------------------");
			System.out.println("��ȣ�� �Է��ϼ��� : ");
			String line = sc.nextLine();
			int no = Integer.parseInt(line);
			Product p = all.get(no - 1);

			info(p);

		} catch (FindException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new Main();
		System.out.println("TEST");

	}

}
