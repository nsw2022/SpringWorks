package teacherMain;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.BiCycle;
import di_p.Camera;
import di_p.HandPhone;
import di_p.InterBiCycle;

public class BiCycle_main2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/bicycle2.xml");

		
		for (String str : "bc1,bc2,bc3".split(",")) {
			InterBiCycle bc = context.getBean(str,InterBiCycle.class);
			System.out.println(bc);
		}
		
	}

}
