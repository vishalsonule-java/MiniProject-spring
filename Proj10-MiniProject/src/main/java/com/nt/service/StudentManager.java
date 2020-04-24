package com.nt.service;

import java.sql.SQLException;

import com.nt.dto.StudentDTO;

public interface StudentManager {
public String registerStudent(StudentDTO dto) throws SQLException;
}
