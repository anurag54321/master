
public class Employee 
{
  private String firstName;
  private String lastName;
  
  Employee(String firstName,String lastName)
  {
	  firstName= firstName.substring(0, 1).toUpperCase()+firstName.substring(1);
	  this.firstName=firstName;
	  lastName= lastName.substring(0, 1).toUpperCase()+lastName.substring(1);
	  this.lastName=lastName;
  }

@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
}


  
 
 
}
