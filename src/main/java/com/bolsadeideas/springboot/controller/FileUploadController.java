package com.bolsadeideas.springboot.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.dto.FileDTO;

@Controller
@RestController
@RequestMapping("/SGD/v1.0")
public class FileUploadController {
	
	@Autowired
	ModelMapper modelMapper;

	@RequestMapping(value = "/files", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void fileUpload(@RequestBody(required = true) FileDTO fileDTO) {
		System.out.println("--->");
		System.out.println(fileDTO);
	}
}
