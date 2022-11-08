package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")            //메모리에 올려줘
public class MemberDAO {
	
	//3. 필드기반 의존성주입 방식(DI)
	//***********************************
	@Autowired      //스프링 너가 알아서 자동주입해줘!!
	private MemberBean member;

	//1. constructor
//	public MemberDAO() {
//		
//	}
//   	
//	public MemberDAO(MemberBean member) {
//		this.member = member;
//	}


	//2. setter
//	public void setMember(MemberBean member) {
//		this.member = member;
//	}
//	
	public void insert() {
		member.output();
		System.out.println("저장하였습니다다다");
	}
	
	
}
