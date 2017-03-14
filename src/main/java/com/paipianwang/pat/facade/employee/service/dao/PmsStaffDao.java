package com.paipianwang.pat.facade.employee.service.dao;




import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.core.dao.BaseDao;
import com.paipianwang.pat.facade.employee.entity.PmsStaff;

public interface PmsStaffDao extends BaseDao<PmsStaff>{

	public long save(final PmsStaff staff);

	public long updateImagePath(final PmsStaff staff);

	public List<PmsStaff> findStaffsByArray(final Map<String, Object> paramMap);

	public long deleteByArray(final Map<String, Object> paramMap);

	public List<PmsStaff> getAll();

	public PmsStaff findStaffById(final long staffId);


}
