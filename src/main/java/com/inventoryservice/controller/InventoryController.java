package com.inventoryservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
	private final InventoryService inventoryService;
	@GetMapping("/{sku-code}")
	@ResponseStatus(HttpStatus.OK)
	public boolean isInStock(@PathVariable("sku-code") String skuCode) {

		return inventoryService.isInStock(skuCode);
	}
}
