package game.domain;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class UrlGcid implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
	
	@Column(nullable = false)
	private int id_g;
	
	
	@Column(nullable = false)
	private String url;
	
	
	@Column(nullable = false)
	private String gcid;
	
	public UrlGcid(int id,String url,String gcid){
		super();
		this.id_g=id;
		this.url=url;
		this.gcid=gcid;
	}

	public int getId_g() {
		return id_g;
	}

	public void setId_g(int id_g) {
		this.id_g = id_g;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGcid() {
		return gcid;
	}

	public void setGcid(String gcid) {
		this.gcid = gcid;
	}
	
	

}
