package pkg1;

import java.util.Iterator;

public class StudentManagementSystem {

	private StudentRepository repo;

    public void setRepo(StudentRepository repository) {
        repo = repository;
    }


	public void listAllStudents() {
            Iterator it= repo.findAllStudents().iterator();

            while(it.hasNext()){
                Student st = (Student)it.next();
                System.out.println("Student's registration number: "+st.getRegNo());
                System.out.println("Student's first name: "+st.getFirstName());
                System.out.println("Student's last name: "+st.getLastName());
                System.out.println("Student's address: "+st.getAddress()+"\n");
            }
	}

	public void registerStudent(Student stu){
            repo.saveStudent(stu);
	}
}
