package vn.phdanglinh.collection;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private double GPA;

    public Student(){

    }

    public Student(int id, String name, int age, double GPA){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student: id= " + id + ", name= " + name
                + ", age= " + age + ", GPA= " + GPA;
    }

    @Override
    public int compareTo(Student student){
        if (this.age == student.age){
            return student.getID() - this.getID();
        }
         return this.getAge() - student.getAge();
    }

    public int getAge(){
        return age;
    }

    public double getGPA(){
        return GPA;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }
}
