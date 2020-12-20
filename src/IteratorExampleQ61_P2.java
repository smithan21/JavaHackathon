import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class IteratorExampleQ61_P2 {
	public static void main(String[] args) {

		LinkedList<IteratorExampleQ61_P1> studentList = new LinkedList<>();
		
		studentList.add(new IteratorExampleQ61_P1("Medha", 2, 150));
		studentList.add(new IteratorExampleQ61_P1("Manu", 4, 180));
		studentList.add(new IteratorExampleQ61_P1("Adarsh", 1, 100));
		studentList.add(new IteratorExampleQ61_P1("Smitha", 3, 165));
		
		Iterator<IteratorExampleQ61_P1> it3 = studentList.iterator();
		while(it3.hasNext()) {
			IteratorExampleQ61_P1 tempStudent = it3.next();
			System.out.println("1. Student: " + tempStudent.Id + " name is " + tempStudent.name);
		}
		
		Collections.sort(studentList); 
		
		Iterator<IteratorExampleQ61_P1> it4 = studentList.iterator();
		while(it4.hasNext()) {
			IteratorExampleQ61_P1 tempStudent = it4.next();
			System.out.println("2. Student: " + tempStudent.Id + " name is " + tempStudent.name);
		}
	}
}

