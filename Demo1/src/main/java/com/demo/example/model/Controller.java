package com.demo.example.model;

import java.util.Optional;

import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class Controller {

	@Autowired
	RegRepository re;
	
//	@Autowired
//	EmailverificationLinkRepo emailrepo;
//	
	JavaMailSender jm;
	
	
	@PostMapping("/hello")
	public ResponseEntity<String> create(@RequestBody Reg reg) {
		
		re.save(reg);
		SimpleMailMessage sm=new SimpleMailMessage();
		String urllink = "http://lgin.com/form";
		sm.setTo(reg.getEmail());
		sm.setSubject("verification link");
		sm.setText("please click the below link to fill form :"+urllink);
		jm.send(sm);
		
	
		return ResponseEntity.ok().body("ok");
		
	}
	
}

