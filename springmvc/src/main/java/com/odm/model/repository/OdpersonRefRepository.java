package com.odm.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.odm.model.entity.OdpersonRefEntity;

@Component
@Repository("odpersonRefRepository")
public interface OdpersonRefRepository extends JpaRepository<OdpersonRefEntity, String> {
	
	OdpersonRefEntity findByPersonId(String personId);
	
}
