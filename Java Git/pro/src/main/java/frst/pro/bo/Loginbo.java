package frst.pro.bo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users1",schema="SYSTEM")
public class Loginbo {
    
    @Id
	@Column(name = "email", nullable = false,unique=true)
	private String email;
	
	@Column(name="password")
	private String password;
	
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
			
	

}
