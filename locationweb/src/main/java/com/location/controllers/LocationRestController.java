package com.location.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.ExceptionHandler.ValidationException;
import com.location.entities.Location;
import com.location.repos.LocationRepository;


import net.bytebuddy.implementation.bytecode.Throw;

@RestController
@RequestMapping("/locations")
public class LocationRestController {

	@Autowired
	LocationRepository locationRepository;
	
	@GetMapping
	public List<Location> getLocations() {
		return locationRepository.findAll();
	}
	
	@PostMapping
	public Location createLocation(@RequestBody @Valid Location location,BindingResult result) {
		if(result.hasErrors()) {
			throw new ValidationException(result.getFieldError().getDefaultMessage());	
			}
			else
			return locationRepository.save(location);
	}
	
	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return locationRepository.save(location);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		
		locationRepository.deleteById(id);
}
	@GetMapping("/{id}")
	public Optional<Location> showLocation(@PathVariable("id") int id) {
		 Optional<Location> location = locationRepository.findById(id);
		 if(location.isPresent())
			 return location;
		 else
			 throw new NullPointerException("id not present table");
	}
	
}