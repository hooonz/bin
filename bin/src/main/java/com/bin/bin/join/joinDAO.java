package com.bin.bin.join;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class joinDAO {
	
	@Autowired	
	SqlSessionTemplate temp;
	
	public void userInsert(joinDTO join_dto) {
		temp.insert("joinSQL.user_add",join_dto);
	}
	
	public void businessInsert(joinDTO join_dto) {
		temp.insert("joinSQL.business_add",join_dto);
	}
}
