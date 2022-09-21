package com.example.demo.utils;

import java.sql.Connection;

import com.training.iface.Repository;
import com.training.implementations.StudentRepositoryImplementation;
import com.training.model.Student;

public class Application {
	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getMySqlConnection() ; 
		Repository<Student> repo = new StudentRepositoryImplementation(con) ; 
		Student saran = new Student("Saran" , 336 , 100) ; 
		Student som = new Student("Somnath" , 340 , 90) ; 
		Student prat = new Student("Pratik" , 346 , 190) ;
//		repo.save(saran);
//		repo.save(som);
//		repo.save(prat);
		Student st = repo.findById(340);
		System.out.println(st);
//		repo.delete(prat);
		for(Student eachStudent:repo.findall()) {
			System.out.println(eachStudent);
		}
		
	}
}
