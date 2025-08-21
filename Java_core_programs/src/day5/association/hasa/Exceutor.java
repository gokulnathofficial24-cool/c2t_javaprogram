package day5.association.hasa;

public class Exceutor {

	public static void main(String[] args) {
		Address address = new Address("dubai street, dubai Colony", "india", "Pondy", "605009");
		Person person = new Person("Gokul nath", address);
		person.displayInfo();

	}

}