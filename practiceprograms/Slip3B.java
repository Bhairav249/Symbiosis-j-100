//define an abstract class shape with abstract method area() and volume(). derived abstract class shape into two classess
cone and cyliender. write a java program to calculate the volume of the cone and cylinder


import java.io.*;
abstract class Shape{
     int a,b;
     Shape(int x, int y){
          a = x;
          b = y;          
         }

     abstract double area();
     abstract double volume();
    }

    class Cone extends Shape{
         Cone(int x, int y){
            super(x,y);
             }

         doubel area(){
              return(a*b*3.14);
              
             }
         double volume(){
              return(3.13*a*a*b);
             }
   
        }
    class Cylinder extends Shape{
        Cylinder(int x, int y){
            super(x,y);
            
            }
           double area(){
               return (2*3.14*a*b*3.14*a*b);
               }
           double volume(){
               return(3.13*a*a*b);
               }

        }

    class Slip3B{

         public static void main(String args[]) throws Exception{
              int r,h,s;
              DataInputStream dr = new DataInputStream(System.in);
              System.out.println("Enter radius, height and side values");

              r = Integer.parseInt(dr.readLine());
              h = Integer.parseInt(dr.readLine()):
              s = Integer.parseInt(dr.readLine());
              Shape s1;

              Cone c1 = new Cone(r,s);
              s1=c1;
              System.out.println("the area of Cone is" + s1.area());
              System.out.println("the area of vlume is" +s1.volume());

              Cylinder cy = new Cylinder(r,h);
              s1=cy;
              System.out.println("the area of Cylinder is" + s1.area());
              System.out.println("the volume of cylinder is" +s1.volume());
              
              }

         
        }















    
