package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=====Teste 1: department insert");
		Department D7 = new Department(8, "D7");
		departmentDao.insert(D7);
		System.out.println("=====Teste 2: department update");
		Department D6 = new Department(6, "D6");
		System.out.println(departmentDao.findById(6));
		departmentDao.update(D6);
		System.out.println(departmentDao.findById(6));
		
		System.out.println("=====Teste 3: department delete");
		departmentDao.deleteById(9);
		
		System.out.println("=====Teste 4: department findById");
		Department dp = departmentDao.findById(3);
		System.out.println(dp);
		System.out.println("=====Teste 5: find all");
		List<Department> list = departmentDao.findAll();
		
		list.forEach(System.out::println);
	}

}
