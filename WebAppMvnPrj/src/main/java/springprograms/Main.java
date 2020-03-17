package springprograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//XML
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) ac.getBean("car");
		System.out.println("From XML(Setter Injection)\n"+car.getModel()+" "+car.getCarName());
		
		//Constructor Injection using ref tag in XML
		System.out.println();
		Employee emp=(Employee)ac.getBean("emp");
		System.out.println("Constructor Injection using ref tag in XML\n"+emp);
		
		//Inheritance
		System.out.println();
		Course c=(Course) ac.getBean("course");
		System.out.println("Inheritance");
		System.out.println("Student No: "+c.getsNo()+"\nStudent Name: "+c.getsName()+"\nCourse Id: "+c.getcId()+"\nCourse Name: "+c.getcName());
		
		//Annotation(no XML file is required)
		System.out.println();
		ApplicationContext anno=new AnnotationConfigApplicationContext(CarBean.class);
		Car car2 = (Car) anno.getBean("car2");
		car2.setCarName("R8");
		car2.setModel("Audi");
		System.out.println("From Annotations\n"+car2.getModel()+" "+car2.getCarName());
		
		//using properties file to fetch values
		System.out.println();
		Car car3=(Car)ac.getBean("car3");
		System.out.println("From properties file:\n"+car3.getModel()+" "+car3.getCarName());		
		
		//Autowiring based on constructor. No need of ref tag
		System.out.println();
		System.out.println("Autowiring based on constructor. No need of ref tag in XML");
		Employee e1=(Employee)ac.getBean("emp2");
		System.out.println(e1);
		
		//Collection setter injection
		System.out.println();
		System.out.println("Collection setter Injection");
		VenCus vc=(VenCus)ac.getBean("vencus");
		vc.display();
		
		//Collection dependency setter injection using ref tag
		System.out.println();
		System.out.println("Collection Setter Injection using ref tag");
		Training tr=(Training) ac.getBean("training");
		tr.display();
		
		System.out.println();
		System.out.println("Cars using map");
		CarUsingMap cm=(CarUsingMap) ac.getBean("carmap");
		cm.display();
		
		//Collection Constructor Injection
		System.out.println();
		System.out.println("Collection Constructor Injection");
		VenCus2 vc2=(VenCus2)ac.getBean("vencus2");
		vc2.display();
		
		//BeanClassUsingAnnotations @Component @Value
		System.out.println();
		System.out.println("BeanClassUsingAnnotations @Component @Value");
		BeanClassUsingAnnotations bcua=(BeanClassUsingAnnotations)ac.getBean("bcua");
		System.out.println("Hi "+bcua.getName());
	}
}
