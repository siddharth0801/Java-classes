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
public class MyPoint {

    double x;
    double y;
    //Constructors
    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    //Getters
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    
    
    
    //Methods
    public double distance(MyPoint p)
    {
        double sq = Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2);
        return Math.sqrt(sq);
    }
    public double distance(double x, double y)
    {
        double sq = Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2);
        return Math.sqrt(sq);
    }
    public static double distance(MyPoint p1, MyPoint p2)
    {
        double sq = Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2);
        return Math.sqrt(sq);
    }   
}
