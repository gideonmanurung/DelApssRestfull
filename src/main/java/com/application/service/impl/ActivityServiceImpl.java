package com.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.model.Activity;
import com.application.repository.ActivityRepository;
import com.application.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService{

	@Autowired
	private ActivityRepository aRepository;
	
	@Override
	public Activity getAcitvity(int idActivity) {
		return aRepository.findOne(idActivity);
	}

	@Override
	public void deleteActivity(int idActivity) {
		aRepository.delete(idActivity);
	}

	@Override
	public Activity saveOrUpdateActivity(Activity activity) {
		return aRepository.save(activity);
	}

	@Override
	public List<Activity> getAllActivity() {
		return aRepository.findAll();
	}

}
