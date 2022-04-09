package com.microservice.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.microservice.service.models.ModelObj;
import com.microservice.service.models.RequestObj;
import com.microservice.service.models.ResponseObj;
import com.microservice.service.utility.AES;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@PostMapping(value = "/postdata", produces = "application/json", consumes = "application/json")
	public ResponseObj postData(@RequestBody RequestObj requestObj) {
		ResponseObj responseObj = new ResponseObj();
		Gson gson = new Gson();
		ModelObj modelObj;
		try {
			modelObj = gson.fromJson(AES.decrypt(requestObj.getMsgObj(), "myKey") , ModelObj.class);
		} catch (Exception e) {
			responseObj.setMsgString("Error: "+e.getMessage());
			return responseObj;
		}
		int update = jdbcTemplate.update("Insert into Persons(acc_no,type,ammount,currency,acc_form) Values(?,?,?,?,?)", new Object[] {modelObj.getAccNo(), modelObj.getType(), modelObj.getAmmount(),modelObj.getCurrency(), modelObj.getAccForm()});
		
		if(update>0) {
			responseObj.setMsgString("Success");
			return responseObj;
		}
		responseObj.setMsgString("Error: Insertion not take place");
		return responseObj;
	}

}
