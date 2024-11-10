import java.io.DataInputStream;
class Slip3A{
     static int temp;
     public static void main(String [] args){
         int n,r,sum=0;
         DataInputStream dr = new DataInputStream(System.in);
         try{
              System.out.println("Enter Number");
              n = Integer.parseInt(dr.readLine());
              temp =n;
              while(n>0){
                    r = n%10;
                    sum = sum+(r*r*r);
                    n=n/10;
                  }
              if(temp==sum){
                   System.out.println(temp + "is An Armstrong Number");

                  }else{
                    System.out.println(temp + "is not An Armstring Number");
                    
             }

      
            }catch(Exception e){}
         
         }
     
    }
