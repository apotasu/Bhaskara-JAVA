package bhaskara;

import java.util.Scanner;
import java.lang.Math;


public class calculadora {
	 public static void main (String arg[]){
		    
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Calculadora baskhara");
	        
	        System.out.println("Digite o A");
	        
	        double a = scanner.nextInt();
	        
	        System.out.println("Digite o B");
	        
	        double b = scanner.nextInt();
	        
	        System.out.println("Digite o C");
	        
	        double c = scanner.nextInt();
	        
	        double delta = (b*b)-4-a*c;
	            if (delta<0){
	                System.out.println("Não existe raizes reais");
	            } else{
	        double raizdelta = Math.sqrt(delta);
	        
	        double o = (b*(-1) + raizdelta) / 2*a;
	        
	        double v = (b*(-1) - raizdelta) / 2*a;
	        
	        System.out.println(o);
	        System.out.println(v);
	        
}
}
}