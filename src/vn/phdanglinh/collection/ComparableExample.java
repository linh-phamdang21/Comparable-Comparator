package vn.phdanglinh.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        // create student list
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Linh",24, 8.22));
        studentList.add(new Student(2,"Nguyen",21, 8.44));
        studentList.add(new Student(3,"Thu",22, 7.84));
        studentList.add(new Student(4,"Phuong Anh",22, 7.03));
        // sort student list
        Collections.sort(studentList);
        // show student list
        for (Student student : studentList){
            System.out.println(student.toString());
        }
    }
}
