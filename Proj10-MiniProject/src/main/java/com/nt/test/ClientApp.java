package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.controler.StudentController;
import com.nt.vo.StudentVo;

public class ClientApp {

	public static void main(String[] args) {
		//create scanner object
		Scanner scan=new Scanner(System.in);
		//create resource object
		Resource res= new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//create Bean factory object
		BeanFactory factory=new XmlBeanFactory(res);
		//create student object
		StudentVo vo=new StudentVo();
		System.out.println("enter student name::");
		vo.setName(scan.next());
		System.out.println("enter student course::");
		vo.setCourse(scan.next());
		System.out.println("enter course year");
		vo.setYear(scan.next());
		System.out.println("enter m1 marks");
		vo.setM1(scan.next());
		System.out.println("enter m2 marks");
		vo.setM2(scan.next());
		System.out.println("enter m3 marks");
		vo.setM3(scan.next());
		//get controller class obj
		StudentController controller=factory.getBean("controller",StudentController.class);
		try {
		//call controller class method
		String result=controller.porcessStudent(vo);
		System.out.println(result);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
