package com.example.demo.repos;

import java.util.Collection;

import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Restaurant;

public class RestaurantRepository implements CrudRepository<Restaurant> {

	@Override
	public boolean save(Restaurant obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Restaurant> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Restaurant obj) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int key) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Restaurant findById(int key) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Restaurant obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
