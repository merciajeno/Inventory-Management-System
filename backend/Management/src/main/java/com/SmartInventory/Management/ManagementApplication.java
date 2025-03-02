package com.SmartInventory.Management;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SmartInventory.Management.entity.Category;
import com.SmartInventory.Management.entity.Product;
import com.SmartInventory.Management.entity.Sales;

@SpringBootApplication
public class ManagementApplication implements CommandLineRunner {

//	@Autowired
//	ProductRepo productRepo;
//	
//	@Autowired
//	CategoryRepo categoryRepo;
//	
//	@Autowired
//	SalesRepo salesRepo;
	public static void main(String[] args)  {
		SpringApplication.run(ManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
