
import java.util.*;

class Student{
    int id;
    String name;
    String Course;
    double javaScore;   
}

public class main{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.Course= sc.next();
        s1.javaScore = sc.nextDouble();

        s2.id = sc.nextInt();
        s2.name = sc.next();
        s2.Course = sc.next();
        s2.javaScore = sc.nextDouble();

        System.out.println(" s1 Student Profile");
        System.out.println("id: " + s1.id);
        System.out.println("name: " + s1.name);
        System.out.println("Course: " + s1.Course);
        System.out.println("Java Score: " + s1.javaScore);

        System.out.println(" s2 Student Profile");
        System.out.println("id: " + s2.id);
        System.out.println("name: " + s2.name);
        System.out.println("Course: " + s2.Course);
        System.out.println("Java Score: " + s2.javaScore);
        
        
    }
}