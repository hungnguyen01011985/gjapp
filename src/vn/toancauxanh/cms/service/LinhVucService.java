package vn.toancauxanh.cms.service;

import java.util.ArrayList;
import java.util.List;

import vn.toancauxanh.gg.model.LinhVuc;
import vn.toancauxanh.gg.model.NguoiGoi;
import vn.toancauxanh.gg.model.QLinhVuc;
import vn.toancauxanh.gg.model.QNguoiGoi;
import vn.toancauxanh.service.BasicService;

public class LinhVucService extends BasicService<LinhVuc>{
	
	private LinhVuc linhVuc;
	
	public LinhVuc getLinhVuc() {		
		return linhVuc;
	}
	
	public List<LinhVuc> getAllLinhVuc() {
		List<LinhVuc> listLinhVuc = new ArrayList<>();
		listLinhVuc.add(null);
		listLinhVuc = find(LinhVuc.class).fetch();
		return listLinhVuc;
	}
	

}
