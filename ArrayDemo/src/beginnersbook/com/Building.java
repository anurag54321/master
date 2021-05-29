package beginnersbook.com;
import java.io.*;
class Building {  
	void color() throws IOException
	{
		  System.out.println("Blue");
	}  
}
class Room extends Building{
	  void color()throws EOFException
	  {
		  System.out.println("White");
	  }  
	  public static void main(String args[]) throws IOException{  
		   Building obj = new Room(); 
		   obj.color();
		  


		  
	  } 
}