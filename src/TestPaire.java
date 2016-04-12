
public class TestPaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paire original = new Paire(6,12);
		System.out.println(original.val1 + " " + original.val2) ;
		Paire copie = original;
		System.out.println(copie.val1 + " " + copie.val2) ;
		copie.val1=10;
		System.out.println(original.val1 + " " + original.val2) ;
		System.out.println(copie.val1 + " " + copie.val2) ;
	}

}
