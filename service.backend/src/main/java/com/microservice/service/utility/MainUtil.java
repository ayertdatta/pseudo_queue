package com.microservice.service.utility;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.microservice.service.models.RequestObj;
import com.microservice.service.models.RequestObjApi;
import com.microservice.service.models.ResponseObj;

public class MainUtil {

	public static ResponseEntity<ResponseObj> postData(ArrayList<RequestObj> requestObjs) {
		for(RequestObj requestObj: requestObjs){
			RestTemplate restTemplate = new RestTemplate();
			Gson gson = new Gson();
			RequestObjApi requestObjApi = new RequestObjApi();
			try {
				requestObjApi.setMsgObj(AES.encrypt( gson.toJson(requestObj), "myKey"));
			} catch (Exception e) {
				return new ResponseEntity<>(new ResponseObj("Error : "+e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
			}
			ResponseObj postForObject = restTemplate.postForObject("http://localhost:8081/api/postdata",requestObjApi, ResponseObj.class);
			if(postForObject.getMsgString().contains("Error")) {
				return new ResponseEntity<>(postForObject, HttpStatus.INTERNAL_SERVER_ERROR);
				
			}
		}
		return new ResponseEntity<>(new ResponseObj("Success"), HttpStatus.OK);
		
	}

}
