package com.bin.bin.review;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class reviewDAO {
	@Autowired	
	SqlSessionTemplate temp;
	
	public void reviewInsert(reviewDTO review_dto) {
		temp.insert("reviewSQL.review_add", review_dto);
	}
	
	public void reviewDelete(int review_num) {
		temp.delete("reviewSQL.review_remove",review_num);
	}
	
	public void reviewUpdate(reviewDTO review_dto) {
		temp.update("reviewSQL.review_renew",review_dto);
	}
	
	public List<reviewDTO> reviewSelect(){
		List<reviewDTO> review_dto_list =temp.selectList("reviewSQL.review_select");
		return review_dto_list;
	}
	
	public reviewDTO reviewDetail(int review_num) {
		reviewDTO review_dto =temp.selectOne("reviewSQL.review_detail",review_num);
		return review_dto;
	}
}
