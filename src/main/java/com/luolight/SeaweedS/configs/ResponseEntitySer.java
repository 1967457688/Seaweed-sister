package com.luolight.SeaweedS.configs;

import java.io.Serializable;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class ResponseEntitySer extends ResponseEntity<Resource> implements Serializable{

	public ResponseEntitySer(HttpStatus status) {
		super(status);
	}

	public ResponseEntitySer(MultiValueMap<String, String> headers, HttpStatus status) {
		super(headers, status);
	}

	public ResponseEntitySer(Resource body, HttpStatus status) {
		super(body, status);
	}

	public ResponseEntitySer(Resource body, MultiValueMap<String, String> headers, HttpStatus status) {
		super(body, headers, status);
	}
	
	private String filePath;

	public final String getFilePath() {
		return filePath;
	}

	public final void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
