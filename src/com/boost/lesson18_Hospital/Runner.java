package com.boost.lesson18_Hospital;

import java.util.PriorityQueue;
import java.util.Queue;

public class Runner {

	public static void main(String[] args) {

		Queue<Patient> patientList = new PriorityQueue<Patient>();

		patientList.offer(new Patient("John Black", Priority.APPENDICITIS));
		patientList.offer(new Patient("Marry White", Priority.HEADACHE));
		patientList.offer(new Patient("Ali Kaplan", Priority.APPENDICITIS));
		patientList.offer(new Patient("Lorenzo Pucci", Priority.BURNED_SKIN));
		patientList.offer(new Patient("Can Kaya", Priority.HEADACHE));
		patientList.offer(new Patient("Ellen Snow", Priority.APPENDICITIS));
		patientList.offer(new Patient("Gianluca Ferrari", Priority.HEADACHE));

		while (!patientList.isEmpty())
			System.out.println(patientList.poll());

	}

}
