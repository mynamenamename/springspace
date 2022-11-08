package ex3_autowiring;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class MessageBeanImpl implements MessageBean{

	private String name;
	private String message;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	@Autowired   //스프링아 너가 알아서 해줘!
	@Qualifier("outputer2") 
	//@Resource(name="outputer2") 왜인지 모르겠지만 안됨 ㅠ
	private Outputer out;
	
	
	@Override
	public void sayHello() {
		System.out.println(name + "님께" + message);  //화면
		try {
			out.writeMessage(name + "님께" + message); //파일 저장
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
