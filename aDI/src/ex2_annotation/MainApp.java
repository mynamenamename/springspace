package ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// [1] 스프링 설정 파일 연결
				ApplicationContext context =
		       new ClassPathXmlApplicationContext("ex2_annotation/applicationContext.xml");
			
		 MemberDAO dao = context.getBean("dao", MemberDAO.class);
		                         //MemberDAO -> memberDAO 무조건 대소문자 잘 구분해야됨
		                         //어노테이션 >> 이름 준걸로 가져오기
		 dao.insert();
				
	}

}
