package pkg1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmsStarter {

	public static void main(String[] args) {
		StudentManagementSystem sms;
		//load the bean from spring
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("./SmsBeans.xml");
	      context.start();

	      sms=(StudentManagementSystem)context.getBean("sms1");
	      
		sms.listAllStudents();
		
		Student stu = new Student("Saman","Senanayake","Colombo",123456);
		Student stu1 = new Student("Nimal","Perera","Nuwara",123457);
		Student stu2 = new Student("Sunil","Silva","Kalutara",123458);
		
		sms.registerStudent(stu);
		sms.registerStudent(stu1);
		sms.registerStudent(stu2);
		
		sms.listAllStudents();
	}
}
