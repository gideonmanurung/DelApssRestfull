package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.Description;

@Repository
public interface DescriptionRepository extends JpaRepository<Description, Integer>{

}
