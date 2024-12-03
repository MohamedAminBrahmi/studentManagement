package esprit.java.main;

import esprit.java.entities.Student;
import esprit.java.entities.StudentManagement;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student Ghassen= new Student(29,"Ghassen",1);
        Student Ahmed= new Student(20,"Ahmed",2);
        Student Salah= new Student(30,"Salah",3);

        List students=new ArrayList<>();

        students.add(Ghassen);
        students.add(Ahmed);
        students.add(Salah);
        StudentManagement st=new StudentManagement();

        st.displayStudents(students,x-> System.out.println(x));

        st.createStudent(()->new Student(29,"Ali",4));

        System.out.println(st.returnStudentsNames(students,s->s.getName()));

        List sortStud =st.sortStudentsById(students,(x,x1)-> x.getId()- x1.getId());
        System.out.println("Sorted Students: ");
        for (int i=0; i<sortStud.size();i++) {
            System.out.println(sortStud.get(i));
        }




    }
}