package com.business.memberservice.repository.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.business.memberservice.model.master.Excercise;


@RepositoryRestResource
public interface ExcerciseRepo extends JpaRepository<Excercise, Long>{

	
}
