package com.boost.lesson18_Hospital;

public class Patient implements Comparable<Patient> {

	private String name;
	private Priority priority;
	private int level;

	public Patient(String name, Priority priority) {
		super();
		this.name = name;
		this.priority = priority;

		if (this.priority == priority.APPENDICITIS)
			this.level = 3;
		else if (this.priority == priority.BURNED_SKIN)
			this.level = 2;
		else {
			this.level = 1;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", priority=" + priority + "]";
	}

	@Override
	public int compareTo(Patient o) {
		if (o.level < this.level)
			return -1;
		else if (o.level > this.level)
			return 1;
		else {
			return 0;
		}

	}

}
