package controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import beans.Student;
import beans.StudentRegistration;

@Controller
public class StudentRetrieveController {
	  @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")

	  @ResponseBody
	  public List<Student> getAllStudents() {
		  System.out.println("In allstudent");
		  
	  return StudentRegistration.getInstance().getStudentRecords();
	  }
}
