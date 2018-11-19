package vn.toancauxanh.gg.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import vn.toancauxanh.model.Model;

@Entity
@Table(name="cauhoi")
public class CauHoi  extends Model<CauHoi>{
	
	private String tieuDe;
	private String noiDung;
	private String fileCauHoiPath;
	private NguoiGoi nguoiGoi;
	private String noiDungTraLoi;
	private String fileTraLoiPath;
	private LinhVuc linhVuc;
	private boolean xuatBan;
	
	
	public CauHoi() {
		super();
	}


	public CauHoi(String tieuDe, String noiDung, String fileCauHoiPath, NguoiGoi nguoiGoi, String noiDungTraLoi,
			String fileTraLoiPath, LinhVuc linhVuc, boolean xuatBan) {
		super();
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.fileCauHoiPath = fileCauHoiPath;
		this.nguoiGoi = nguoiGoi;
		this.noiDungTraLoi = noiDungTraLoi;
		this.fileTraLoiPath = fileTraLoiPath;
		this.linhVuc = linhVuc;
		this.xuatBan = xuatBan;
	}


	public String getTieuDe() {
		return tieuDe;
	}


	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}


	public String getNoiDung() {
		return noiDung;
	}


	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}


	public String getFileCauHoiPath() {
		return fileCauHoiPath;
	}


	public void setFileCauHoiPath(String fileCauHoiPath) {
		this.fileCauHoiPath = fileCauHoiPath;
	}

	@ManyToOne
	public NguoiGoi getNguoiGoi() {
		return nguoiGoi;
	}


	public void setNguoiGoi(NguoiGoi nguoiGoi) {
		this.nguoiGoi = nguoiGoi;
	}

	public String getNoiDungTraLoi() {
		return noiDungTraLoi;
	}


	public void setNoiDungTraLoi(String noiDungTraLoi) {
		this.noiDungTraLoi = noiDungTraLoi;
	}


	public String getFileTraLoiPath() {
		return fileTraLoiPath;
	}


	public void setFileTraLoiPath(String fileTraLoiPath) {
		this.fileTraLoiPath = fileTraLoiPath;
	}

	@ManyToOne
	public LinhVuc getLinhVuc() {
		return linhVuc;
	}


	public void setLinhVuc(LinhVuc linhVuc) {
		this.linhVuc = linhVuc;
	}


	public boolean isXuatBan() {
		return xuatBan;
	}


	public void setXuatBan(boolean xuatBan) {
		this.xuatBan = xuatBan;
	}
	
	

}
