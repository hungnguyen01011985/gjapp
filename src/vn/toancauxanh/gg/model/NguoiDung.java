package vn.toancauxanh.gg.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import vn.toancauxanh.model.Model;

@Entity
@Table(name="nguoidung")
public class NguoiDung extends Model<NguoiDung> {
	
	private String hoVaTen="";
	private String soDienThoai="";
	private String diaChi="";
	private Date ngaySinh;
	private String email="";
	private String matKhau="";
	private String sakkey="";
	private DonVi donVi;
	
	
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getSakkey() {
		return sakkey;
	}
	public void setSakkey(String sakkey) {
		this.sakkey = sakkey;
	}
	public DonVi getDonVi() {
		return donVi;
	}
	public void setDonVi(DonVi donVi) {
		this.donVi = donVi;
	}
	
	
	
}
