package com.classicmodels.offices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.classicmodels.offices.entity.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {

}
