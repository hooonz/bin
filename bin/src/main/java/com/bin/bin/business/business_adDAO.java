package com.bin.bin.business;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class business_adDAO {
	@Autowired	
	SqlSessionTemplate temp;
	
	public void adInsert(business_adDTO ad_dto) {
		temp.insert("business_adSQL.business_add",ad_dto);
	}
	
	public void adDelete(int ad_num) {
		temp.delete("business_adSQL.business_remove",ad_num);
	}
	
	public void adUpdate(business_adDTO ad_dto) {
		temp.update("business_adSQL.business_renew",ad_dto);
	}
	
	public List<business_adDTO> adSelect(){
		List<business_adDTO> ad_dto_list = temp.selectList("business_adSQL.business_select");
		return ad_dto_list;
	}
	
	public business_adDTO adDetail(int ad_num) {
		business_adDTO ad_dto = temp.selectOne("business_adSQL.business_detail",ad_num);
		return ad_dto;
	}
}
