package aplication;

import java.util.Date;
import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println("===== Teste 1 findById =====");
		System.out.println(seller);
		
		System.out.println("\n ===== Teste 2 Seller FindByDepartment  =====");
		Department department = new Department(2, null);
		List <Seller> list= sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			
			System.out.println(obj);
		}
		
		
		System.out.println("\n ===== Teste 3 Seller FindAll  =====");
	
		list= sellerDao.findAll();
		
		for(Seller obj: list) {
			
			System.out.println(obj);
		}
		
		System.out.println("\n ===== Teste 4 Seller Insert  =====");
		//Seller newSeller = new Seller(null, "Mateus", "Mateus@gmail.com", new Date(), 4000.00, department);
		//sellerDao.insert(newSeller);
	//	System.out.println("Inserted new id= "+ newSeller.getId());
		
		System.out.println("\n ===== Teste 5 Seller Update  =====");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Upadate Completed");
		
		System.out.println("\n ===== Teste 6 Seller Delete  =====");
		sellerDao.deleteById(16);
		System.out.println("delete Completed");
	}

}
