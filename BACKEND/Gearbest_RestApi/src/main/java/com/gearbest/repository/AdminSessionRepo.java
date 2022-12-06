package com.gearbest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gearbest.model.CurrentAdminSession;

@Repository
public interface AdminSessionRepo extends JpaRepository<CurrentAdminSession, Integer>{
	
	public List<CurrentAdminSession> findByUuid(String uuid);

}
