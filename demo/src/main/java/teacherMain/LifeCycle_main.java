package teacherMain;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/lifeCycle.xml");

		System.out.println(context.getBean("um1"));
		System.out.println(context.getBean("um2"));
		System.out.println(context.getBean("um3"));
		System.out.println(context.getBean("co1"));
		System.out.println(context.getBean("co2"));
		
		context.close();
		
		/*
		 * 학생 bean을 구현하세요
           
           bean 이름이 
           red로 시작되는  객체의 평균 점수를 이용하여 수  우  미  양  가
           blue로 시작되는 객체의 평균 점수를 이용하여 A   B  C   D  F
           Yello로 시작되는객체의 평균 점수를 이용하여 1   2  3   4  5 
           
           로 등급을 처리하세요
		 * 
		 * 
		 * */
		
	}

}
