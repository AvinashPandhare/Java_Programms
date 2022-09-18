package encapsulation;

public class Child_Class extends Parent_Class  {

	public static void main(String[] args) {
		
		Child_Class obj1=new Child_Class();
		
		int a=obj1.getIndex();
		
		System.out.println(a);
		
		obj1.setIndex(2);
		
		int b=obj1.getIndex();
		
		System.out.println(b);
		
		
		System.out.println(obj1.getAvi());
		
		obj1.setAvi("My name is Avinash Pandhare");
		
		System.out.println(obj1.getAvi());
		
		//We can overload static method but we can not override static method

	}

}
