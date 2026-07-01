package Lab001;

class Student{

    String name;

    void display(){
        System.out.println(name);
    }
}

public class Lab001{

    public static void main(String[] args){

        Student s = new Student();
        s.name="Vardhan";
        s.display();
    }
}