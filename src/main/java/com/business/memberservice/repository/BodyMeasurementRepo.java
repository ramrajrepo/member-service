package com.business.memberservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.business.memberservice.model.BodyMeasurement;


@Repository
public interface BodyMeasurementRepo extends JpaRepository<BodyMeasurement, Long>{

	
}
