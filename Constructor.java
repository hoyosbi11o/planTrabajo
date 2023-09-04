import javax.swing.JOptionPane;

public class Constructor {

public Constructor() {
	proceso miproceso = new proceso();
	procesoDos miDos=new  procesoDos();
	 Object desicion;
	 String renombrar;
	 do {
	 desicion = JOptionPane.showInputDialog(null,"Desea.. ","Plan de trabajo",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Seleccione","Bloque-A","Bloque-B","Salir"},"Seleccione");
	 renombrar=String.valueOf(desicion);
	 switch (renombrar) {
	case "Bloque-A":
		miproceso.inicar();
		break;
	case "Bloque-B":
		miDos.iniciarDos();
		break;
	case "Salir":
		JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
		break;
	default:
		break;
	}
		} while (renombrar!="Salir");
	 
}



}
