//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6{
    public static void main(String[] args){
        Scanner myScanner= new Scanner (System.in);
        
        double radius=0;
        System.out.println("Enter the radius:");
        radius=myScanner.nextDouble();
        
        double diameter= radius * 2; 
        
        final double pi=3.14159;
        
        double area=(pi*radius*radius);
        area=area*1000;
        area=(int)area;
        area=(double)area;
        area=area/1000;
        
        double circum = (pi*diameter);
        circum=circum*1000;
        circum= (int)circum;
        circum=(double)circum;
        circum=circum/1000;
        
        System.out.println();
        System.out.println("The Radius of the circle= "+radius);
        System.out.println();
        System.out.println("The Diameter of the circle= "+ diameter);
        System.out.println();
        System.out.println("The Area of the circle= "+area);
        System.out.println();
        System.out.println("The Circumference of the circle= "+ circum);
        
    }
}
//Paste console output below:
/*
Enter the radius:
3.712

The Radius of the circle= 3.712

The Diameter of the circle= 7.424

The Area of the circle= 43.287

The Circumference of the circle= 23.323

*/
