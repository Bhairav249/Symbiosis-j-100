imprt java.io*;

abstract class Shape{
     int a,b
     Shape(int x, int y){
        a=x ;
        b=y;
         }
         abstract double area();
         abstract double volume();
    }

    class Cone extends Shape{
        Cone(int x, int y){
             super(x,y);
             
            }
        double area(){
             return(a*b*3.14)
            }
        double volume(){
            return(3.14*a*a*b)
            }
        }
    class Cyliner extends Shape{
         Cylinder(int x, int y){
              super(x,y);
             }
           double area(){
              return(2*3.14*a*b*3.14*a*b);
              
               }
          double volume(){
              return (3.14*a*a*b);
              
             }
        }

    class CalculateArea{

          public static void main(String args[]) throw Exception{
           int r,h,s;
            DataInputString dr = new DataInputString(System.in);
            System.out.println("Enter radius, height and side values");
            r = Integer.parseInt(dr.readLine());
            h = Integer.parseInt(dr.readLine());
            s = Integer.parseInt(dr.readLine());
            Shape s1;

           Cone c1 = new Cone(r,s);
           s1=c1;
            System.out.println("The area of Cone is" + s1.area());
            System.out.println("the volume of cone is" + s1.vloume());

           Cylinder cy = new Cylinder(r,s);
           s1=cy;
           System.out.println("The area of Cylinder is" + s1.area());
           System.out.println("the volume of Cylinder is" + s1.vloume());

         }
}

           