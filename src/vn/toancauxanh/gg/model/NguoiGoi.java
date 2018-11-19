package vn.toancauxanh.gg.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import vn.toancauxanh.model.Model;

@Entity
@Table(name="nguoigoi")
public class NguoiGoi extends Model<NguoiGoi> {
	
	private String ten;
	private String diaChi;
	private String email;
	private long soDienThoai;
	
	
	public NguoiGoi() {
		super();
	}


	public NguoiGoi(String ten, String diaChi, String email, long soDienThoai) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.email = email;
		this.soDienThoai = soDienThoai;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getSoDienThoai() {
		return soDienThoai;
	}


	public void setSoDienThoai(long soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	
	
}
