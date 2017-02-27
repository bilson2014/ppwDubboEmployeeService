package com.paipianwang.pat.facade.employee.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paipianwang.pat.facade.employee.entity.PmsEmployee;
import com.paipianwang.pat.facade.employee.service.PmsEmployeeFacade;
import com.paipianwang.pat.facade.employee.service.biz.PmsEmployeeBiz;


@Service("pmsEmployeeFacade")
public class PmsEmployeeServiceImpl implements PmsEmployeeFacade{

	@Autowired
	private PmsEmployeeBiz pmsEmployeeBiz;
	@Override
	public PmsEmployee doLogin(final String loginName,final String password) {
		return pmsEmployeeBiz.doLogin(loginName,password);
	}

}
