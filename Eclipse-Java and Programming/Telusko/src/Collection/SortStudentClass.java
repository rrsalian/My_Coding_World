package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Using Comparator...
//This is for sort the class of Student mark with respect to their mark and display mark and ID using comparator

public class SortStudentClass {

	public static void main(String[] args) {
		
		List<Student> stud=new ArrayList<>();
		stud.add(new Student(1,45));
		stud.add(new Student(2,35));
		stud.add(new Student(3,75));
		stud.add(new Student(4,95));
		stud.add(new Student(5,25));
		stud.add(new Student(6,15));
		stud.add(new Student(7,85));
		stud.add(new Student(8,65));
		
		
		Collections.sort(stud, (a,b)->{
			return a.mark<b.mark?1:-1;
		});
        
		for(Student i:stud) {
			System.out.println(i);
		}
	}

}

class Student{
	int id;
	int mark;
	Student(int id,int mark){
		this.id=id;
		this.mark=mark;
	}
	
	public String toString() {
		return "Strudnet id= "+id+" Marks = "+mark;
	}
}
