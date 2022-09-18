package allJavaPrograms;

public class spl_character_remove {

	public static void main(String[] args) {
		String a="Avin@a$sh";
		//a=a.replaceAll( regex:"[^a-zA-Z0-9]", replacement:"");
		a=a.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(a);

	}

}
