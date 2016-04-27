package SetterObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"SetterObjectInjection/spring.xml","SetterObjectInjection/spring1.xml"};
		ApplicationContext factory=new ClassPathXmlApplicationContext(str);
		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource(str));
		Student s=(Student)factory.getBean("stu");
		System.out.println(s);
	}

}
