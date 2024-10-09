package aplication;

import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println("===== Teste1 findById =====");
		System.out.println(seller);
		
		System.out.println("\n ===== Teste2 Seller FindByDepartment  =====");
		Department department = new Department(2, null);
		List <Seller> list= sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			
			System.out.println(obj);
		}
		
		
		System.out.println("\n ===== Teste3 Seller FindAll  =====");
	
		list= sellerDao.findAll();
		
		for(Seller obj: list) {
			
			System.out.println(obj);
		}
		
		
		
	}

}
