package com.example.serverFile.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.serverFile.service.first;
import com.example.serverFile.service.firtServiceImpl;

@Controller
@RequestMapping("/dataC")
public class dataController {

	private static first serve;

	public dataController() {
		serve = new firtServiceImpl();
	}

	@GetMapping("/ddd")
	@ResponseBody
	public Map<String,Object> name() {
		return serve.formName();
	}
}