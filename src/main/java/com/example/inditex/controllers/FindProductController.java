package com.example.inditex.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.inditex.persistence.Prices;
import com.example.inditex.repository.PricesRepository;

@Controller
@RequestMapping(path="/find")
public class FindProductController {

	@Autowired
	private PricesRepository pricesRepository;
	
	@GetMapping(path="/getFindProduct")
	public @ResponseBody ResponseEntity<Iterable<Prices>> getFindProduct() {
		Iterable<Prices> users =  pricesRepository.findAll();
		if (users == null) {
			return new ResponseEntity<>(users, HttpStatus.NOT_FOUND);
		} else if (users != null && !users.iterator().hasNext()) {
			return new ResponseEntity<>(users, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	
}