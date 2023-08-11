package teacherMain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Camera;
import di_p.HambugerSet;
import di_p.HandPhone;

public class Collection_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/collection.xml");

		
		ArrayList arr1 = context.getBean("arr1",ArrayList.class);
		System.out.println(arr1);
		HashSet ss1 = context.getBean("ss1",HashSet.class);
		System.out.println(ss1);
		LinkedHashSet ss2 = context.getBean("ss2",LinkedHashSet.class);
		System.out.println(ss2);
		HashMap map1 = context.getBean("map1",HashMap.class);
		System.out.println(map1);
		
		DIColl dic = context.getBean("dic",DIColl.class);
		System.out.println(dic.nick+","+dic.age);
		System.out.println(Arrays.toString(dic.arr));
		System.out.println(Arrays.toString(dic.arr1));
		System.out.println(dic.arr2);
		System.out.println(dic.ss1);
		System.out.println(dic.mm1);
	}

}
