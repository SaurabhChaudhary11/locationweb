package com.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entities.Location;
import com.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
locationRepository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		return locationRepository.findById(id).get();
	
//	return null;
	}

	@Override
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}
	public LocationRepository getLocationRepository() {
		return locationRepository;
	}

	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}


}
