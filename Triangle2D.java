/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops_ass;

/**
 *
 * @author hp
 */

public class Triangle2D {

    MyPoint p1;
    MyPoint p2;
    MyPoint p3;
    
    //Getters
    public MyPoint getP1()
    {
        return p1;
    }
    public MyPoint getP2()
    {
        return this.p2;
    }
    public MyPoint getP3()
    {
        return this.p3;
    }
    
    //Setters
    public void setP1(MyPoint p)
    {
        this.p1 = p;
    }
    public void setP2(MyPoint p)
    {
        this.p1 = p;
    }
    public void setP3(MyPoint p3)
    {
        this.p1 = p3;
    }
    
    //Constructors
    public Triangle2D()
    {
        this.p1 = new MyPoint();
        this.p2 = new MyPoint(1,1);
        this.p3 = new MyPoint(2,5);
    }
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    //Methods
    public double getArea()
    {
        double a = 0.5*(p1.x*(p2.y-p3.y) + p2.x*(p3.y-p1.y) + p3.x*(p1.y-p2.y));
        if (a < 0)
            return a*-1;
        else
            return a;
    }
    public double getPerimeter()
    {
        return MyPoint.distance(p1,p2)+MyPoint.distance(p3,p2)+MyPoint.distance(p1,p3);
    }
    public boolean contains(MyPoint p)
    {
        return p.distance(p1) < p1.distance(p2) && p.distance(p1) < p1.distance(p3)
                && p.distance(p2) < p2.distance(p1) && p.distance(p2) < p2.distance(p3)
                && p.distance(p3) < p3.distance(p1) && p.distance(p3) < p3.distance(p2);
    }
    public boolean contains(Triangle2D t)
    {
        return this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3);
    }

}
