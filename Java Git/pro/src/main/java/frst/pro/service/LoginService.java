package frst.pro.service;

import frst.pro.bo.Loginbo;
import frst.pro.daoImpl.LogindaoImpl;

public class LoginService {

	public static int createLogin(Loginbo loginbo) {
		LogindaoImpl logindaoImpl=new LogindaoImpl();
		return logindaoImpl.createLogin(loginbo);
	
		
	}
	

}
