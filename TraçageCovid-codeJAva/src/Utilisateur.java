import java.util.ArrayList;
import java.util.List;

public class Utilisateur extends CasContact {
	private String tel;
	private String email;
	private List<CasContact> casContacts = new ArrayList<CasContact>();
	
	public Utilisateur(String cin, String tel, String email) {
		super(cin);
		this.tel = tel;
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<CasContact> getCasContacts() {
		return casContacts;
	}

	public void setCasContacts(List<CasContact> casContacts) {
		this.casContacts = casContacts;
	}
	
	
}
