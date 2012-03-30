
package pkg1;

public class Student {
    private String firstName;
	private String lastName;
	private long regNumber;
	private String address;


	   public Student(String firstName,String lastName,String address,long regNumber){
		   this.firstName=firstName;
		   this.lastName=lastName;
		   this.address=address;
		   this.regNumber=regNumber;
	   }
	   
       public long getRegNo(){
           return regNumber;
       }

       public String getFirstName(){
           return firstName;
       }

       public String getLastName(){
           return lastName;
       }

       public String getAddress(){
           return address;
       }

}
