package day8.interface_example;

public class Student implements Coder {
	@Override
	public void codingWorks() {
		System.out.println("Must wakeup at"+wakeuptime);
		System.out.println("Working with the eclipse and github");
	}

}