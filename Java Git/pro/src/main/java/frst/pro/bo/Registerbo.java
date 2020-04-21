package frst.pro.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="register",schema="SYSTEM")
public class Registerbo {
@Column(name="name")
private String name;
@Id
@Column(name = "email", nullable = false,unique=true)
private String email;
@Column(name="password")
private String password;
@Column(name="confirm")
private String confirm;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirm() {
	return confirm;
}
public void setConfirm(String confirm) {
	this.confirm = confirm;
}	
}
