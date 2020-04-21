package frst.pro.service;

import frst.pro.bo.Loginbo;
import frst.pro.bo.Registerbo;
import frst.pro.daoImpl.LogindaoImpl;
import frst.pro.daoImpl.RegisterdaoImpl;

public class RegisterService {
	
	public static int createRegister(Registerbo registerbo) {
		RegisterdaoImpl registerdaoImpl=new RegisterdaoImpl();
		return registerdaoImpl.createRegister(registerbo);
	
		
	}
	

}
