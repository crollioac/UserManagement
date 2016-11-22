package com.intervidd.usermanagement.dao;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.intervidd.usermanagement.entity.PrimaryVideo;

@Transactional
public interface PrimaryVideoDao extends JpaRepository<PrimaryVideo, Serializable> {

	List<PrimaryVideo> findByUserId(Long userId);
	
}
