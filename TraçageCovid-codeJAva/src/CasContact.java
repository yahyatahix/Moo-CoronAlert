import java.util.ArrayList;
import java.util.List;

public class CasContact {
	protected String cin ; 
	protected List<String> codes = new ArrayList<String>();
	private boolean etat = false;
	public CasContact(String cin) {
		super();
		this.cin = cin;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public List<String> getCodes() {
		return codes;
	}
	public void setCodes(List<String> codes) {
		this.codes = codes;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	

}
