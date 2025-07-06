package com.jyothir.local.repository;

import com.jyothir.local.model.ServiceList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceList, Integer> {

    @Query("select s from ServiceList s where s.customer.id = :customerId")
    List<ServiceList> getServicesByCustomerId(@Param("customerId") int customerId);

}
