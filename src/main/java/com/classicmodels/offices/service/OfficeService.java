package com.classicmodels.offices.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicmodels.offices.entity.Office;
import com.classicmodels.offices.repository.OfficeRepository;
@Service
public class OfficeService {
	@Autowired
	OfficeRepository office;
	public Office insertData(Office off) {
		office.save(off);
		return off;
	}

	public Office updateData(Office off) {
		office.save(off);
		return off;
	}
	
	public List<Office> displayData() {
		List<Office> result=office.findAll();
		return result ;
	}
	
	public Office dispSpecific(String officeCode) {
		return office.findById(officeCode).get();
	}
	public void deleteData(String officeCode) {
		 office.deleteById(officeCode);
	}
}
