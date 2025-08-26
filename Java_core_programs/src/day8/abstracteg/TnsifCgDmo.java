package day8.abstracteg;

public class TnsifCgDmo {
	public static void main(String[]args) {
		Trainer t=new Tech_Trainer();
		t.session();
		t.checks();
		t=new SoftSkill_Trainer();
		
		t.session();
		t.checks();
	}

}