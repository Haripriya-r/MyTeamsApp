package frst.pro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import frst.pro.bo.Loginbo;
import frst.pro.service.LoginService;

@RestController
public class LoginController{
	@PostMapping(value="/createLogin",consumes = "application/json")
	public int createLogin(@RequestBody Loginbo loginbo) {
		return LoginService.createLogin(loginbo);	
	}
	

}
