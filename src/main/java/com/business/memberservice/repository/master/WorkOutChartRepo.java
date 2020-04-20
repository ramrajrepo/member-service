package com.business.memberservice.repository.master;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.business.memberservice.model.master.WorkOutChart;

@RepositoryRestResource
public interface WorkOutChartRepo extends JpaRepository<WorkOutChart, Long>{

}
