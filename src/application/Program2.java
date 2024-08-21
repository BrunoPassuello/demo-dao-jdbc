package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("===== TEST 1: department findById =====");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("===== TEST 2: department findAll =====");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department dp : list) {
			System.out.println(dp);
		}
		
		System.out.println("===== TEST 3: department insert =====");
		Department depa = new Department("Smartphone");
		departmentDao.insert(depa);
		System.out.println("Inserted!");
		
		System.out.println("===== TEST 4: department update =====");

		Department depar = new Department(2, "Cups");
		departmentDao.update(depar);
		System.out.println("UPDATED!");
		
	}

}
