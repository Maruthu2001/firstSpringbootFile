package com.example.serverFile.applicationBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ApplicationBean {
	public String demo;
	
//	public initializeBean() {
//		demo = "";
//	}

	public ApplicationBean() {
		demo = "";
	}
}