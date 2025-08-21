package day5.hierarchicalinheritance;

public class HierarchicalDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("gokul", "pondy");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Nikhil", "pnondy", 1, 240, "vespa");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("puvi", "pondy", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}