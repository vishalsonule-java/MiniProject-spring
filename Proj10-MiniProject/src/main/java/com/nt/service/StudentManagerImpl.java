package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentManagerImpl implements StudentManager {
private int total;
private String result;
private float avg;
private StudentDAO dao=null;
private StudentBO bo=null;
public StudentManagerImpl(StudentDAO dao) {
	this.dao = dao;
}

	public String registerStudent(StudentDTO dto) throws SQLException {
		total=dto.getM1()+dto.getM2()+dto.getM3();
		if(dto.getM1()>=35&&dto.getM2()>=35&&dto.getM3()>=35)
			result="Pass";
		else
			result="fail";
		avg=total/3.0f;
		//convert dto to bo
		bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		bo.setAvg(avg);
		bo.setResult(result);
		bo.setTotal(total);
		int count=dao.addStudent(bo);
		if(count>=1)
			return "student added sucessfully..";
		else
			return "student not added";
	}

	
}
