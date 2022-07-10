package application;

import java.util.Date;
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
		
		System.out.println("========Test 4: insert ========");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("New id = " + newSeller.getId());
		
		System.out.println("========Test 5: update =======");
		seller = sellerDao.findById(4);
		seller.setName("bob");
		sellerDao.update(seller);
		System.out.println(sellerDao.findById(1));
		
		System.out.println("======Test 6: seller delete ======");
		List<Seller> listx = sellerDao.findAll();
		System.out.println("Before: ");
		for (Seller e : listx) {
			System.out.println(e);
		}
		
		System.out.println("==== after");
		sellerDao.deleteById(12);
		listx = sellerDao.findAll();
		for (Seller e : listx) {
			System.out.println(e);
		}
	}
	

}
