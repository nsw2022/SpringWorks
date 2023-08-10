package di_p_main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Coffee;
import di_p.CoffeeShop;

public class LookupMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/lookupCoffe.xml");

		CoffeeShop cs = context.getBean("cs",CoffeeShop.class);
		
		System.out.println("order_am : " + cs.order_am());
		cs.order_void();
		
		//System.out.println("order_void : " + cs.order_void());
		System.out.println("order_tea " + cs.order_tea());
		//System.out.println("order_private " + cs.order_private());
		
		// private 재정이안됨
		System.out.println("order_private2 " + cs.order_private2());
		
		// final 재정의안됨
		System.out.println("order_final" + cs.order_final());
		
		// static 재정의 안됨
		System.out.println("order_static"+ cs.order_static());
		
		// 재정의
		System.out.println("order_pinao"+cs.order_piano());
		
		// 추상메서드 재정의
		System.out.println("order_hunter"+cs.order_hunter());
		
		
		// 추상 클래스를 look으로 재정의안하면 에러
		// System.out.println("order_latte"+cs.order_latte());
		
//		Coffee co = context.getBean("co",Coffee.class);
//		System.out.println("co : " + co);
		
		/*
			
		식당의 식단을 xml 에서 지정하세요
		
		식단표
		아침 점심 저녁
		
		xml에서 각 식단대로 메뉴를 리턴
		
		

		 * */
		
		
		
	}
}
