package Projecto;

import java.util.Random;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Call {
	
	
	//llamadas id, numero, hora, fecha, llamadasperdidas, mensaje, llamadasdel dia 
	
	int id;
	int number;
	String initialDate;
	String message;
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	
	Random rand = new Random();
	
    public Call(int CallId, String text) {
		id = CallId;
		number = rand.nextInt(40000000) + 5000000;
		initialDate = dateFormat.format(date);
		message = text;
	}
	
	public void ChangeId(int CallId) {
		id = CallId;
	}
    
    public int GetNumber() {
    	
    	return number;
    }
    
    public String GetDate() {
    	
    	return initialDate;
    }
    public String GetMessage() {
    	
    	return message;
    }
    
}
