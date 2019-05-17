package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Using Comparable interface
//This is for sort the class of Student mark with respect to their mark and display mark and ID

public class ComparableSortStudentMark {

	public static void main(String[] args) {

		List<Student1> stud=new ArrayList<>();
		stud.add(new Student1(1,45));
		stud.add(new Student1(2,35));
		stud.add(new Student1(3,75));
		stud.add(new Student1(4,95));
		stud.add(new Student1(5,25));
		stud.add(new Student1(6,15));
		stud.add(new Student1(7,85));
		stud.add(new Student1(8,65));


		Collections.sort(stud);
		
		
		for(Student1 i:stud) {
			System.out.println(i);
		}
	}
}



class Student1 implements Comparable<Student1>{
	int id;
	int mark;
	Student1(int id,int mark){
		this.id=id;
		this.mark=mark;
	}

	public String toString() {
		return "Strudnet id= "+id+" Marks = "+mark;
	}

	public int compareTo(Student1 s) {
		return this.mark<s.mark?1:-1;

	}
}
