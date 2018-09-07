package com.bin.bin.review;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class review_replyDAO {
	@Autowired	
	SqlSessionTemplate temp;
	
	public void replyInsert(review_replyDTO reply_dto) {
		temp.insert("review_replySQL.review_reply_add", reply_dto);
	}
	
	public void replywDelete(int reply_num) {
		temp.delete("review_replySQL.review_reply_remove",reply_num);
	}
	
	public List<review_replyDTO> replySelect(){
		List<review_replyDTO> reply_dto_list = temp.selectList("review_replySQL.review_reply_select");
		return reply_dto_list;
	}
}
