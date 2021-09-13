package com.classicmodels.offices.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.classicmodels.offices.entity.Office;
import com.classicmodels.offices.service.OfficeService;

@RestController
public class OfficeController {
	@Autowired
	OfficeService officeService;
	@PostMapping("/insert")
	public Office insert(@RequestBody Office off) {
		officeService.insertData(off);
		return off;
	}
	@PutMapping("/update")
	public Office update(@RequestBody Office off) {
		officeService.updateData(off);
		return off;
	}
    @GetMapping("/display")
	public List<Office> display() {
		List<Office> result=officeService.displayData();
		return result ;
	}
    @GetMapping("/display/{officeCode}")
	public Office dispSpe(@PathVariable String officeCode) {
		return officeService.dispSpecific(officeCode);
	}
    @DeleteMapping("/delete/{officeCode}")
	public void delete(@PathVariable String officeCode) {
		 officeService.deleteData(officeCode);
	}
}