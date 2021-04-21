package com.day;

import java.util.ArrayList;

public class Cs implements I{
	String title;
	String director;
	String genre;
	String count;
	String actor;
	String actress;
	String time;
	
	@Override
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(title);
		list.add(director);
		list.add(genre);
		list.add(count);
		list.add(actor);
		list.add(actress);
		list.add(time);
		return list;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
