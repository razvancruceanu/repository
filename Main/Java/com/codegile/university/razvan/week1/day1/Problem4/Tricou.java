package com.codegile.university.razvan.week1.day1.Problem4;

public class Tricou {
	
	private String id;
	private String description;
	private String color;
	private String size;
	
	public Tricou(String id, String description, String color, String size) {
		super();
		this.id = id;
		this.description = description;
		this.color = color;
		this.size = size;
	}
	
	

	public Tricou() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}



	@Override
	public String toString() {
		return "Tricou [id=" + id + ", description=" + description + ", color=" + color + ", size=" + size + "]";
	}
	
	
	
}
