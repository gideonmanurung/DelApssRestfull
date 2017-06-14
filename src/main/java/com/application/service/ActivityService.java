package com.application.service;

import java.util.List;

import com.application.model.Activity;

public interface ActivityService {
	public Activity getAcitvity(int idActivity);
	public void deleteActivity(int idActivity);
	public Activity saveOrUpdateActivity(Activity activity);
	public List<Activity> getAllActivity();
}
