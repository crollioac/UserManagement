package com.intervidd.usermanagement.services;

import com.intervidd.usermanagement.response.VideoResponse;

public interface VideoService {

	VideoResponse  getVideoOfUserId(Long userID);

	VideoResponse postVideoOfUserId(Long usreID);

	VideoResponse updateVideoOfUserId(Long userID);

	
	
	
}
