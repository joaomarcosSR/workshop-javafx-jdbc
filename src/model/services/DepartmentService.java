package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		
		list.add(new Department(1, "D1"));
		list.add(new Department(2, "D2"));
		list.add(new Department(3, "D3"));
		list.add(new Department(4, "D4"));
		list.add(new Department(5, "D5"));
		
		return list;
	}
	
}
