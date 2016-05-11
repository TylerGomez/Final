import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Driver {
	static List<AbstractPerson> students = new ArrayList<AbstractPerson>();
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int selection = -1;
		
		while(selection != 0) {
			System.out.println("What would you like to do?");
			System.out.println("-------------");
			System.out.println("1 - Create Student");
			System.out.println("0 - Exit");
			System.out.println("-------------");
			System.out.println("Your choice: ");
			selection = in.nextInt();
			handleMain(selection);
		}
		for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
		
	}
		in.close();
	}
	
	public static void handleMain(int selection) {
        switch(selection) {
        case 1:
                createStudents();
                break;
        default:
                break;
        }
	}
	
	public static void createStudents() {
		int selection = -1;
		
		while(selection != 0) {
			System.out.println("Student Creation");
			System.out.println("-------------");
			System.out.print("Enter a first name");
			String firstname = in.next();
			System.out.print("Enter a last name");
			String lastname = in.next();
			Student s = new Student(firstname, lastname);
			students.add(s);
		}
	}
}
