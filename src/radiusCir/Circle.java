package radiusCir;
import java.util.*;
public class Circle {
	public static void main(String[] args) {
		  Scanner io = new Scanner(System.in);
		  
		  System.out.println("Let's find the perimeter and area of a circle! " +  "\nEnter the radius:");
		  
		  double radius = io.nextDouble();
		  
		  System.out.println("Perimeter is = " + (2 * radius * Math.PI));
		  System.out.println("Area is = " + (Math.PI * radius * radius));
		 }
}

