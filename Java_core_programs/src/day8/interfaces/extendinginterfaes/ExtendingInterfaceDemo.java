package day8.interfaces.extendinginterfaes;

public class ExtendingInterfaceDemo implements ChildInterface{
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}

}