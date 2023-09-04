
import javax.swing.JOptionPane;
public class proceso {
	Object taller;
	String tallerDos,resp;
	public void inicar() {
		do {
			 taller =JOptionPane.showInputDialog(null,"Ejercicios Practicos","TALLER #1", JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Seleccione Uno","#1","#2","#3","#4","#5","Salir"},"Seleccione Uno");
			 tallerDos=String.valueOf(taller);
		switch (tallerDos) {
		case "#1":
			numeroUno();
			break;
		case "#2":
			Integer numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			numeroDos(numero);
			break;
		case "#3":
			System.out.println("El numero es: "+ numeroTres());
			break;
		case "#4":
			Integer cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
			System.out.println("El numero mayor es: "+numeroCuatro(cantidad));
			break;
		case "#5":
			Integer tama=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo 1 y 2"));
			System.out.println( numeroCinco(tama));
			break;
			
		case "Salir":

			break;
		default:
			break;
		}
		} while (tallerDos!="Salir");
	}

	private Integer numeroCinco(Integer tama) {
		int array[]=new int [tama];
		int array2[]=new int [tama];
		int acumuladora=0;
		for (int i = 0; i < tama; i++) {
			array[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+(i+1)+" del primer arreglo"));
			array2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+(i+1)+" del segundo arreglo"));
			for (int j = 0; j < tama; j++) {
				acumuladora=array[i]+array2[i];
			}
			System.out.println( "La suma del arreglo "+i+" es: "+acumuladora);
		}
		
		return null;
	}

	private Integer numeroCuatro(Integer cantidad) {
		Integer arreglo[]=new Integer [cantidad];
		for (int i = 0; i < cantidad; i++) {
			arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
		}
		Integer numeroMayor=arreglo[0];
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i]>numeroMayor) {
				numeroMayor=arreglo[i];
			}
		}
		return numeroMayor;
	}

	private int numeroTres() {
		int n = (int) (Math.random() * (1 - 100)) + 100;
		return n;
	}

	private void numeroDos(Integer numero) {
		if (numero>10) 
			JOptionPane.showMessageDialog(null, "El numero "+numero+" es mayor a 10","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "El numero "+numero+" es menor a 10","INFORMACION",JOptionPane.INFORMATION_MESSAGE);
	}

	private void numeroUno() {
		System.out.println("Ingreso de nombre");
		System.out.println(JOptionPane.showInputDialog("Ingrese su nombre Completo"));
	}
}
