package com.paipianwang.pat.facade.employee.service.dao;



import java.util.Map;

import com.paipianwang.pat.common.core.dao.BaseDao;
import com.paipianwang.pat.facade.employee.entity.PmsEmployee;

public interface PmsEmployeeDao extends BaseDao<PmsEmployee>{

	public PmsEmployee doLogin(final Map<String, Object> paramMap);


}
