package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	Connection con = null;
	PreparedStatement ps = null;
	
	private static final String QUERY = "INSERT INTO STUDENT VALUES(studid.nextval,?,?,?,?,?,?,?,?,?)";

	public int addStudent(StudentBO bo) throws SQLException {
		//establish the connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
		//create prepared statement object
		if(con!=null)
			ps=con.prepareStatement(QUERY);
		//set query parameters
		ps.setString(1, bo.getName());
		ps.setString(2,bo.getCourse());
		ps.setInt(3, bo.getYear());
		ps.setInt(4, bo.getM1());
		ps.setInt(5, bo.getM2());
		ps.setInt(6, bo.getM3());
		ps.setString(7, bo.getResult());
		ps.setInt(8, bo.getTotal());
		ps.setFloat(9, bo.getAvg());
		//execute query
		return ps.executeUpdate();
	}

}
