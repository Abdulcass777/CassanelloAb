import java.util.Scanner;
public class Fibonacci {
		
	int numero, limite, fibo1, fibo2, i;

	public void comprobarNumero() {	
			
		Scanner valor=new Scanner(System.in);
				        
		System.out.println("\n Digite el limite de la serie fibonacci: \n");
        limite=valor.nextInt();
       
        System.out.println("\n Digite el numero para comprobar si esta en la serie de fibonacci: \n");
        numero=valor.nextInt();

			
        while(limite<=1&&limite!=0);
        System.out.println("\n Los " + limite + " primeros numeros de la serie de Fibonacci son: \n");

        fibo1=1;
        fibo2=1;
		
		System.out.print( fibo1 + " ");	
			
		for(i=2;i<=limite;i++){
			
             System.out.print(fibo2 + " ");
			   

	    if(numero==fibo2){
			
	    System.out.println("\n \n El numero " + numero +" se encuentra dentro de la serie de Fibonacci \n");
        break; 		  
			
		}else if(i<limite){
			 
			 
		fibo2 = fibo1 + fibo2;
        fibo1 = fibo2 - fibo1;	 

	   }else{
		   
		     System.out.println("\n \n  El numero " + numero + " no se encuentra dentro de la serie de Fibonacci \n"); 
		   
	   } 
			 
	}
	
	}

	public static void main(String args []) {
		
		Fibonacci fibonacci=new Fibonacci();
		fibonacci.comprobarNumero();
		
		
		
	}

}
