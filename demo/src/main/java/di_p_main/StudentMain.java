package di_p_main;

import java.util.Arrays;
import java.util.TreeSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.School;
import di_p.StudentTest;

public class StudentMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/StudentTest.xml");

		for (String str : "stu1,stu2,stu3,stu4,stu5".split(",")) {
			//StudentTest students = (StudentTest) context.getBean(str);
			//System.out.println(students);
		}
		
		
		TreeSet<StudentTest> ts = new TreeSet<>();

		for (String str : "stu1,stu2,stu3,stu4,stu5".split(",")) {
			StudentTest students = (StudentTest) context.getBean(str);
			ts.add(students);
		}
		
		for (StudentTest students : ts) {
			System.out.println(students);
		}
		
		
	}

}
