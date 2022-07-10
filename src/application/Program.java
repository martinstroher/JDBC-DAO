package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("======= Test 1: seller findById =======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("======= Test 2: seller findByDepartment =======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller dp : list) {
			System.out.println(dp);
		}
		System.out.println("=======Test 3: find all========");
		List<Seller> list1 = sellerDao.findAll();
		for (Seller dp : list1) {
			System.out.println(dp);
		}
	}
	

}
