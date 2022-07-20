package com.boost.lesson18_Kitchen;

public class Plate {

	int id;
	boolean isDirty;

	public Plate(int id, boolean isDirty) {
		super();
		this.id = id;
		this.isDirty = isDirty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDirty() {
		return isDirty;
	}

	public void setDirty(boolean isDirty) {
		this.isDirty = isDirty;
	}

	@Override
	public String toString() {
		return "Plate [id=" + id + ", isDirty=" + isDirty + "]";
	}

}
