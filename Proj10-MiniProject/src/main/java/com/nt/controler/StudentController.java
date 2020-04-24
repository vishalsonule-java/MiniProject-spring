package com.nt.controler;

import java.sql.SQLException;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentManager;
import com.nt.vo.StudentVo;

public class StudentController {
private StudentManager service;
private StudentDTO dto=null;
public StudentController(StudentManager service) {
	this.service = service;
}
public String porcessStudent(StudentVo vo)throws SQLException{
	//convert vo to dto
	dto=new StudentDTO();
	dto.setName(vo.getName());
	dto.setCourse(vo.getCourse());
	dto.setYear(Integer.parseInt(vo.getYear()));
	dto.setM1(Integer.parseInt(vo.getM1()));
	dto.setM2(Integer.parseInt(vo.getM2()));
	dto.setM3(Integer.parseInt(vo.getM3()));
	return service.registerStudent(dto);
	
}
}
