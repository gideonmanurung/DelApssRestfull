package com.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Description;
import com.application.repository.DescriptionRepository;
import com.application.service.DescriptionService;

@Service
public class DescriptionServiceImpl implements DescriptionService{
	@Autowired
	private DescriptionRepository dRepository;

	@Override
	public Description getDescription(int idDescription) {
		return dRepository.findOne(idDescription);
	}

	@Override
	public void deleteDescription(int idDescription) {
		dRepository.delete(idDescription);
	}

	@Override
	public Description saveOrUpdateDescription(Description description) {
		return dRepository.save(description);
	}

	@Override
	public List<Description> getAllDescription() {
		return dRepository.findAll();
	}
}
