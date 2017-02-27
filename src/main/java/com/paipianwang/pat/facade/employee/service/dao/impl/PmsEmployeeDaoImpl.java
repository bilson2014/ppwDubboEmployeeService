package com.paipianwang.pat.facade.employee.service.dao.impl;



import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paipianwang.pat.common.core.dao.impl.BaseDaoImpl;
import com.paipianwang.pat.facade.employee.entity.PmsEmployee;
import com.paipianwang.pat.facade.employee.service.dao.PmsEmployeeDao;
@Repository
public class PmsEmployeeDaoImpl extends BaseDaoImpl<PmsEmployee> implements PmsEmployeeDao {

	public static final String SQL_DOLOGIN= "doLogin";
	
	@Autowired
	private SqlSessionTemplate sessionTemplate = null;

	@Override
	public PmsEmployee doLogin(Map<String, Object> paramMap) {
		return sessionTemplate.selectOne(getStatement(SQL_DOLOGIN),paramMap);
	}
	

}
