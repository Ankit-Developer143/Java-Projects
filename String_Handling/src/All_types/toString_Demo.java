package All_types;

public class toString_Demo {
	int id;
	String Name;
	toString_Demo(int id,String Name){
		this.id  = id;
		this.Name  = Name;
		
		
	}
	public String toString() { //toString Override Methods
		return id+" "+Name;
		
	}
	 public static void main(String[] args) {
		toString_Demo t = new toString_Demo(101,"Ankit");
		System.out.println(t);//compiler writes here s1.toString() 
		System.out.println(t.toString()); //Same as above
		
		//Both Output is:-101 Ankit
	}

}
