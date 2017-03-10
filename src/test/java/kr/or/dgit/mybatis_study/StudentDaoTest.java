package kr.or.dgit.mybatis_study;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_study.dto.PhoneNumber;
import kr.or.dgit.mybatis_study.dto.Student;
import kr.or.dgit.mybatis_study.service.StudentService;

public class StudentDaoTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	/*@Test
	public void testselectStudentByAll() {
		List<Student>lists = studentService.selectStudentByAll();
		for(Student s : lists){
			System.out.println(s);
		}
		Assert.assertNotNull(lists); 
	}*/
	
	/*@Test
	public void testinsertStudent() {
		Student std = new Student(11,"아구몬","fds@naver.com",new Date());
		int res = studentService.insertStudent(std);
		Assert.assertEquals(1, res); 
	}*/
	
	@Test
	public void testinsertStudentWithPhone() {
		Student std = new Student(6,"꽃미남","abc@naver.com",new Date(),new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudentWithPhone(std);
		Assert.assertEquals(1, res);
	}
	
	/*@Test
	public void testselectStudentByNo() {
		Student student = studentService.selectStudentByNo(8);
		Assert.assertNotNull(student); 
	}*/
	
	/*@Test
	public void testupdateStudent() {
		Student std = new Student(2,"아구몬","asdf@co.kr", new Date());
		int res = studentService.updateStudent(std);
		Assert.assertEquals(1, res); 
	}*/
	
	/*@Test
	public void testdeleteStudentByNo() {
		int student = studentService.deleteStudentByNo(11);
		Assert.assertEquals(1, student);
	}*/
}
