package com.example.MappingProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MappingProject.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
