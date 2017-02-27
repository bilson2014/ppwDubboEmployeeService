package com.paipianwang.pat.facade.employee.service.biz;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paipianwang.pat.facade.employee.entity.PmsEmployee;
import com.paipianwang.pat.facade.employee.service.dao.PmsEmployeeDao;


@Service
@Transactional
public class PmsEmployeeBiz {

	@Autowired
	private PmsEmployeeDao pmsEmployeeDao;

	public PmsEmployee doLogin(String loginName, String password) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("loginName", loginName);
		paramMap.put("password", password);
		return pmsEmployeeDao.doLogin(paramMap);
	}

	
	
}
