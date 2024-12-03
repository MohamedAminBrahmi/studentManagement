package esprit.java.entities;

import esprit.java.interfaces.Management;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class StudentManagement implements Management {
    public void displayStudents(List<Student> students, Consumer<Student> con){
        for (int i=0; i<students.size();i++){
            con.accept(students.get(i));

        }
    }
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con){
        for (int i=0; i<students.size();i++){
            if (pre.test(students.get(i))){
                con.accept(students.get(i));
            }


        }

    }
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun){
        StringBuilder name =new StringBuilder();
        for (int i=0; i<students.size();i++){
           name.append(fun.apply(students.get(i))) ;
            name.append("/") ;

        }
        return name.toString();
    }
    public Student createStudent(Supplier<Student> sup){
       return sup.get();
    }
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com){
        List<Student> listo = new ArrayList<>(students); // Create a copy of the original list
        for (int i=0; i<students.size();i++){
            listo.sort(com);        }

        return listo;
    }







}
