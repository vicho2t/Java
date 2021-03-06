package Projecto;

import java.util.ArrayList;

public class TaskList {

	private  ArrayList<Task> list;
	
	
    //CONSTRUCTOR VACIO
    public TaskList()
    {
        list = new ArrayList<Task>();
    }
	
	
	//METODO PARA AGREGAR TAREAS A LA LISTA
	public void AddTask(Task task) {  
		
		list.add(task);
		list.get(list.size()-1).ChangeId(list.size()-1);
	}
	
	//METODO PARA REMOVER TAREAS DE LA LISTA 
	public void RemoveTask(int index) {
		
		if (list.size() == 0) System.out.println("No hay tareas!");
		else if(list.size() >= index) list.remove(index-1);
		else System.out.println("El numero que ingreso no pertenece a una tarea");
		
	}
	
    //METODO PARA MOSTRAR LO QUE CONTIENE LA LISTA DE TAREAS
	public void ShowTaskList() {
		
		if (list.size() == 0) System.out.println("No hay tareas!");
		
		else
		for(int i=0;i < list.size();i++) {
			
			System.out.println((i+1) + "(" + list.get(i).GetDate() + "): " + list.get(i).GetMessage());
			
		}
		
		
	}
	public String[] getLista() {
		String[] x = new String [list.size()];
		for (int i = 0; i < list.size(); i++)
		{
		    x[i] = list.get(i).GetMessage();
		}
		return x;
		
	}
	
}
