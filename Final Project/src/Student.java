

public class Student extends AbstractPerson{
	
	public Student(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
        return firstname + " " + lastname;

	}
	
}
