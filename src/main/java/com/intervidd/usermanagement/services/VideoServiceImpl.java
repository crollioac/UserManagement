package com.intervidd.usermanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.intervidd.usermanagement.dao.PrimaryVideoDao;
import com.intervidd.usermanagement.response.VideoResponse;

@Component
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	PrimaryVideoDao primaryVideoDao;
	
	@Autowired
	VideoResponse videoResponse;

	@Override
	public VideoResponse getVideoOfUserId(Long userId) {
		// TODO Auto-generated method stub
		
		videoResponse.setPrimaryVideo(primaryVideoDao.findByUserId(userId));
		
		return videoResponse;
	}

	@Override
	public VideoResponse postVideoOfUserId(Long usreID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VideoResponse updateVideoOfUserId(Long usreID) {
		// TODO Auto-generated method stub
		return null;
	}

}
