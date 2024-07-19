package com.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inventoryservice.model.Inventory;
import com.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args->{
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_13");
            inventory.setQuantity(100);
            Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_15_red");
            inventory1.setQuantity(0);
            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
		};
	}

}
