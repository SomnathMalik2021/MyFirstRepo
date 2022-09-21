package com.training.iface;

import java.util.*;

import com.training.model.Student;

public interface Repository<T> {
	public boolean save(T obj); // create 
	public Collection<T> findall() ; // read 
	public boolean delete(T obj) throws Exception; // delete
	public boolean update(T from, T to) throws Exception;
	public Student findById(int i); 
}
