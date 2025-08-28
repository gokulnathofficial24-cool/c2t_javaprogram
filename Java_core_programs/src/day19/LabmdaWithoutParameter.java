package day19;

public class LabmdaWithoutParameter {
public static void main(String[] args) {
		
		IStatement s = () -> {return "Hello World!!";};
		System.out.println(s.show());


	}
}