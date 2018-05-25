package P2;

import java.util.ArrayList;

public class Reposicion {

	ArrayList<EmpleadoReposicion> listaEmpleados;
	
	public Reposicion() {
		
listaEmpleados = new ArrayList<EmpleadoReposicion>();
		
 
	}
	
public void addBodega(Producto producto, Bodega bodega) { 
	if (listaEmpleados.size() > 0)	{bodega.AddProducto(producto); bodega.PonerEnPasillo(producto);}
	
	else System.out.println("No hay empleados para mover los productos!"); 
	

	}
	
public void AddEmpleado(EmpleadoReposicion empleado) {
	listaEmpleados.add(empleado);
	
}
public void RemoveEmpleado(int index) {
	listaEmpleados.remove(index);
	
}

}
