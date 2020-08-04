package All_types;
/*The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
=> The class is final so we cannot create the subclass.
=> There is no setter methods i.e. we have no option to change the value of the instance variable.
=> These points makes this class as immutable.*/

public final class Create_Immutable_Class {
	final String PanCardNumber;
	
	public Create_Immutable_Class(String PanCardNumber) {
		this.PanCardNumber = PanCardNumber;
		
	}
		public String display() {
			return PanCardNumber;
		}
		
	
	public static void main(String[] args) {
		Create_Immutable_Class c= new Create_Immutable_Class("12911");
	    System.out.println(c.PanCardNumber);
	}

}
