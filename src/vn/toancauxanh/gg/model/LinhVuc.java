package vn.toancauxanh.gg.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import vn.toancauxanh.model.Model;

@Entity
@Table(name="linhvuc")
public class LinhVuc extends Model<LinhVuc>{
	
	private String linhVuc;

	public LinhVuc(String linhVuc) {
		super();
		this.linhVuc = linhVuc;
	}

	public String getLinhVuc() {
		return linhVuc;
	}

	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}
	
	
}
