/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops_ass;

import java.io.IOException;
import java.lang.System.Logger.Level;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;

/**
 *
 * @author hp
 */
public class OOPS_ASS {

    public static void main(String[] args) throws IOException {
        
            Scanner s=new Scanner(System.in);
            Logger l= Logger.getGlobal();
            l.info("Hello I am Siddharth");
            Handler h =new FileHandler("C:\\Users\\hp\\Desktop\\h.txt");
            l.addHandler(h);
            Filter f=new Filter() 
            {
                @Override
                public boolean isLoggable(LogRecord lr) {
                    return lr.getLevel().intValue() > Level.INFO.intValue(); //To change body of generated methods, choose Tools | Templates.
                }
            };
            l.setFilter(f);
            int x=s.nextInt();
            if(x<0)
                l.severe("Negative Number");
            System.out.printf("OOPs");
            
    //        // TODO code application logic here
    //        Course c1 = new Course("OOPS");
    //        c1.addStudent("Siddharth Singh");
    //        c1.addStudent("Kushagra H");
    //        c1.addStudent("Nawab K");
    //        c1.dropStudent("Nawab K");
    //        System.out.println("Course Name = "+c1.courseName);
    //        System.out.println("Number of students = "+c1.numberOfStudents);
    //        System.out.print("Students = ");
    //        for(int i = 0; i < c1.numberOfStudents; i++)
    //        {
    //            System.out.print(c1.students[i]+"\n");
    ////            if(i != c1.numberOfStudents-1)
    ////            {
    ////                System.out.print(", ");
    ////            }
    ////            else
    ////                System.out.println();
    //        }
//                
//        MyPoint p1 = new MyPoint();
//        MyPoint p2 = new MyPoint(10,30.5);
//        System.out.println("Distance between p1 and p2 = "+p1.distance(p2));
//        System.out.println("Distance between p1 and p2 = "+ MyPoint.distance(p1,p2));
//        
//        
//        Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5));
//        System.out.println("Area of t1 = "+t1.getArea());
//        System.out.println("Perimeter of t1 = "+t1.getPerimeter());
//        System.out.println("Is (3,3) in t1 : "+t1.contains(new MyPoint(3,3)));
//        System.out.println("Is Triangle2D((2.9,2),(4,1),(1,3.4)) in t1 : "
//                +t1.contains(new Triangle2D(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4))));
//        
        
        
    }
}
