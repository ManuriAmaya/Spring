package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();
	//private Map<Long, Student> studentsDb ;
	
	/*public void setStudentDb(Map<Long, Student> aStudentsDb){
		studentsDb = aStudentsDb;
	}*/

	@Override
	public void saveStudent(Student stu) {
		studentsDb.put(stu.getRegNo(), stu);

	}

	@Override
	public void deleteStudent(Student stu) {
            studentsDb.remove(stu.getRegNo());

	}

	@Override
	public Student findStudent(long regNumber) {
            try{
                return studentsDb.get(regNumber);
            }
            finally{
                System.out.println("There's no such student with the given registration number");
                return null;
            }
	}

	@Override
	public void updateStudent(Student stu) {
            studentsDb.put(stu.getRegNo(), stu);
	}

	@Override
	public List<Student> findAllStudents() {
            ArrayList list = new ArrayList();
            list.addAll(studentsDb.values());
		return list;
	}

}
