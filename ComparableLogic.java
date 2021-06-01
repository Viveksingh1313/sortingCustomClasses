// A Java program to demonstrate use of Comparable
import java.io.*;
import java.util.*;

// A class 'Movie' that implements Comparable
class Student implements Comparable<Student> {

    private int marks;
    private String name;
    private int year;

    public int compareTo(Student m)
    {
        return this.marks - m.marks; // sort based on marks

        //To sort based on year uncomment below line
        // return (this.marks - m.marks);
    }

    // Constructor
    public Student(String name, int marks, int year)
    {
        this.name = name;
        this.marks = marks;
        this.year = year;
    }

    // Getter methods for accessing private data
    public int getMarks() { return marks; }
    public String getName() { return name; }
    public int getYear()	 { return year; }
}

// Driver class
public class ComparableLogic
{
    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("John Mayer", 89, 2015));
        studentList.add(new Student("Doja Cat", 87, 1977));
        studentList.add(new Student("Eric Clapton", 85, 1980));
        studentList.add(new Student("Andrew NG", 86, 1983));

        Collections.sort(studentList);

        System.out.println("Students after sorting based on marks : ");
        for (Student student: studentList)
        {
            System.out.println(student.getName() + " " +
                    student.getMarks() + " " +
                    student.getYear());
        }
    }
}

//Output :
//        Students after sorting based on marks :
//        Eric Clapton 85 1980
//        Andrew NG 86 1983
//        Doja Cat 87 1977
//        John Mayer 89 2015
