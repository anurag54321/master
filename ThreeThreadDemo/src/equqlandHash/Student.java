package equqlandHash;

public class Student 
{

    private int id;
    private String name;
    private int rollno;
    
    public Student(int id, String name,int rollno)
    {
    	this.id=id;
    	this.name=name;
    	this.rollno=rollno;
    }
   
	
	
	@Override
	public int hashCode() {
		
		return id+name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if(id==other.id && name==other.name)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ",rollno="+ rollno +"]";
	}
    
    
    

}
