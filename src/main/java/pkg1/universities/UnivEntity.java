package pkg1.universities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="universities")
public class UnivEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String univName;
	private String address;
	public UnivEntity() {
		super();
	}
	public UnivEntity(int id, String univName, String address) {
		super();
		this.id = id;
		this.univName = univName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public String getUnivName() {
		return univName;
	}
	public void setUnivName(String univName) {
		this.univName = univName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
