package com.tiendaGBackendv2;

// import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioTest {
	
	@org.junit.jupiter.api.Test
	public void generatePassword() {
		BCryptPasswordEncoder passGen = new BCryptPasswordEncoder();
		System.out.println(passGen.encode("admin"));
	}
}