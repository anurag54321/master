import java.io.FileNotFoundException;
import java.sql.SQLException;

class A
 {
	 protected  int m1() throws SQLException
	 {
		System.out.println("m1 method");
		return 0; 
	 }
 }
  class B extends A
 {
	 public  int  m1() throws SQLException
	 {
		System.out.println("OverLoaded Method m1()");
		return 0;
	 }
 }
public class Test {

	public static void main(String[] args) throws SQLException 
	{
	A a1 = new B();
	  a1.m1();
		

	}

}
