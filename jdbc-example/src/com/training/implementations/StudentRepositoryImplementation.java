package com.training.implementations;

import java.sql.*;
import java.util.*;

import com.training.error.NotFoundException;
import com.training.iface.Repository;
import com.training.model.Student;

public class StudentRepositoryImplementation implements Repository<Student> {

	private  Connection con ;
	private Collection<Student> storage ; 
	
	public StudentRepositoryImplementation(Connection con){
		super(); 
		this.con = con ;
	}
	
	@Override
	public boolean save(Student obj) {
		String sql = "insert into lumen_student values(?,?,?)" ; 
		int rowUpdated = 0 ; 
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(sql);
		
			pstmt.setString(1, obj.getName());
			pstmt.setInt(2, obj.getRollNumber());
			pstmt.setInt(3, obj.getMark());
			
			rowUpdated = pstmt.executeUpdate() ;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  
		return (rowUpdated > 0) ; 
	}

	@Override
	public Collection<Student> findall() {
		List<Student>studentList = new ArrayList<>();
		try {
			String sql = "select * from lumen_student";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int rollNumber = rs.getInt("roll");
				int mark = rs.getInt("mark");
				String studentName=rs.getString("StudentName");
				Student st = new Student(studentName, rollNumber, mark);
				studentList.add(st);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return studentList ; 
	}

	@Override
	public boolean delete(Student obj) {
		int rowCount=0;
		try {
			String sql = "delete from lumen_student where StudentName=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.getName());
			rowCount=pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (rowCount>0);
	
	}

	@Override
	public boolean update(Student from, Student to) throws NotFoundException {
		if(this.storage.contains(from)) {
			this.storage.remove(from) ; 
			this.storage.add(to) ; 
			return true ; 
		} else {
			throw new NotFoundException("Updatable Student Object Not Found!") ; 
		} 
	}
	public  Student findById(int roll) {
		Student st=null;
		try {
			String sql = "select * from lumen_student where roll=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, roll);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int rollNumber = rs.getInt("roll");
				int mark = rs.getInt("mark");
				String studentName=rs.getString("StudentName");
				st = new Student(studentName, rollNumber, mark);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return st ; 
	}
	
}
