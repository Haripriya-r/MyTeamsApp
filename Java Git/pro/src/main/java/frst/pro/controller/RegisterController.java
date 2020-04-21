package frst.pro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import frst.pro.bo.Loginbo;
import frst.pro.bo.Registerbo;
import frst.pro.service.LoginService;
import frst.pro.service.RegisterService;

@RestController
public class RegisterController {
		@PostMapping(value="/createRegister",consumes = "application/json")
		public int createRegister(@RequestBody Registerbo registerbo) {
			return RegisterService.createRegister(registerbo);	
		}

}
