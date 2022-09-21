package com.example.demo.utils;

import java.sql.Connection;
import java.util.Collection;

import com.training.iface.Repository;

public class StudentRepositoryImpl implements Repository<Student> {
	
	private Connection con=null;
	
	public StudentRepositoryImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean save(Student obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Student> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Student obj) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Student from, Student to) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public com.training.model.Student findById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
