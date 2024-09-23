package aplication;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department department = new Department(1, "Claudio");
		
		Seller seller = new Seller(1, "Claudio","claudio@gmail.com", new Date() , 4000.0, department);
		System.out.println(seller);
	}

}
