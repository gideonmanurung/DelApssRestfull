package com.application.service;

import java.util.List;

import com.application.model.Description;

public interface DescriptionService {
	public Description getDescription(int idDescription);
	public void deleteDescription(int idDescription);
	public Description saveOrUpdateDescription(Description description);
	public List<Description> getAllDescription();

}
