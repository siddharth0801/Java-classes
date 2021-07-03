/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops_ass;


public class Course {
    String courseName;
    String[] students = new String[100];
    int numberOfStudents = 0;
    
    public Course(String courseName)
    {
        this.courseName = courseName;
    }
    
    //Getters
    public String[] getStudents()
    {
        return this.students;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    public int getNumberOfStudents()
    {
        return this.numberOfStudents;
    }
    
    public void addStudent(String student)
    {
        if(this.students.length <= this.numberOfStudents)
        {
            String[] AS = new String[this.numberOfStudents+1];
            System.arraycopy(students, 0, AS, 0, numberOfStudents);
            this.students = AS;
            this.students[this.numberOfStudents] = student;
            this.numberOfStudents += 1;
        }
        else
        {
            students[this.numberOfStudents] = student;
            numberOfStudents += 1;
        }
    }
    
    public void dropStudent(String student)
    {
        for(int i = 0; i < this.numberOfStudents; i++)
        {
            if(this.students[i].equals(student))
            {
                for(int j = i; j < this.numberOfStudents - 1; j++)
                {
                    this.students[j] = this.students[j+1];
                }
                this.numberOfStudents -= 1;
            }
        }
    }
    
    public void clear()
    {
        String[] emptyArray = new String[100];
        this.students = emptyArray;
        this.numberOfStudents = 0;
    }
    
}
