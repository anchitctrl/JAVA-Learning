package learnJava;

//Encapsulation -> Binding data with methods
class Student
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//getters and setters
	
	
}
public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.setRollno(2);
		obj.setName("Anchit");
		
		System.out.println(obj.getName());
		System.out.println(obj.getRollno());
	}

}
