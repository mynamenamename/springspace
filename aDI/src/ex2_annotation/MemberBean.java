package ex2_annotation;

import org.springframework.stereotype.Component;

@Component       //포스트잇 같은거임,,,스프링 니가 객체 알아서 생성해
public class MemberBean {
	
  private String name = "홍길동";
  private int age= 33;
  private String message = "오늘도 화이팅팅팅";
  
  //------------------
  public void output() {
	  System.out.println(name + "[" + age + "]" + message);
  }
 
  
 
//  public MemberBean() {
//	System.out.println("기본생성자");
// }

  //1. constructor 이용
// public MemberBean(String name, int age, String message) {
//	super();
//	this.name = name;
//	this.age = age;
//	this.message = message;
//	System.out.println("인자 있는 생성자");
//}
//  
  
   //2. setter 이용 
//  public String getName() {
//	return name;
//  }
//   public void setName(String name) {
//	this.name = name;
//  }
//  public int getAge() {
//	return age;
// }
// public void setAge(int age) {
//	this.age = age;
// }
// public String getMessage() {
//	return message;
// }
//  public void setMessage(String message) {
//	this.message = message;
//  }
  
  
  
}

