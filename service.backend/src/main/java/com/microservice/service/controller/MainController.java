package com.microservice.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.service.models.RequestObj;
import com.microservice.service.models.ResponseObj;
import com.microservice.service.utility.MainUtil;

@RestController
@RequestMapping("/main")
public class MainController {

	@PostMapping(value = "/postdata", produces = "application/json", consumes = "application/json")
	public ResponseEntity<ResponseObj> postData(@RequestBody ArrayList<RequestObj> requestObjs) {
		return MainUtil.postData(requestObjs);
	}
}
