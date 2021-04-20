package com.day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_including_multiclass {
	public static void main(String[] args) {
		ArrayList<I> list = new ArrayList<I>();
		LinkedList<I> link = new LinkedList<I>();

		PhoneData phone_data = new PhoneData();
		Movie movie = new Movie();
		Data_in data_in = new Data_in();

		list.add(phone_data);
		list.add(movie); 
		list.add(data_in);

		link.add(phone_data);
		link.add(movie);
		link.add(data_in); 

		for (int i = 0; i < list.size(); i++) {

			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				System.out.println(list.get(i).GetList().get(j));
			}

			System.out.println("*********************");
		}
		print_test2(list);
		print_test2(link);


	}

	static void print_test2(List<I> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).GetList().size());
			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				System.out.println(list.get(i).GetList().get(j));
			}
		}
	}
}
