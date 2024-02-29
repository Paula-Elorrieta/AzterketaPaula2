package modelo;

public class Liburua {
	
	private String izenburua;
	private String isbn;
	private String idazlea;
	


	public Liburua() {
		
		this.izenburua = "behin behinekoa";
		this.isbn = "XXXX";
		
	}
	
	public Liburua(String izenburua, String isbn, String idazlea) {
		
		this.izenburua = izenburua;
		this.isbn = isbn;
		this.idazlea = idazlea;
	}
	
	public String getizenburua() {
		return izenburua;
	}
	public void setizenburua(String izenburua) {
		this.izenburua = izenburua;
	}
	public String getisbn() {
		return isbn;
	}
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	public String getidazlea() {
		return idazlea;
	}
	public void setidazlea(String idazlea) {
		this.idazlea = idazlea;
	}
	
	@Override
	public String toString() {
		return "Liburua [izenburua=" + izenburua + ", isbn=" + isbn + ", idazlea=" + idazlea + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Liburua))
			return false;
		Liburua other = (Liburua) obj;
		
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}


	

}
