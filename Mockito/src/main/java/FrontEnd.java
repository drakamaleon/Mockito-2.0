import java.util.Scanner;
public class FrontEnd {

	public static void main(String[] args) {
		String opcionS;
		int opcion;
		Scanner sc;
		boolean bandera=true;
		// TODO Auto-generated method stub
		System.out.println("Calculadora");
		System.out.println("Escoja una operaci�n");
		System.out.println("1) Suma");
		System.out.println("2) Multiplicaci�n");
		System.out.println("3) Resta");
		do {
			sc=new Scanner(System.in);
			opcionS=sc.nextLine();
			try {
	            opcion = Integer.parseInt(opcionS);
	            switch(opcion) {
	            	case 1:
	            		break;
	            	case 2:
	            		break;
	            	case 3:
	            		break;
	            	default:
	            		System.out.println("Ingrese una opci�n v�lida");
	            }
	            
	        } catch (NumberFormatException excepcion) {
	            bandera = true;
	            System.out.println("Ingrese un n�mero");
	        }
		}while(bandera);
		
	}
	 

}
