package com.paipianwang.pat.facade.employee.service.biz;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.employee.entity.PmsStaff;
import com.paipianwang.pat.facade.employee.service.dao.PmsStaffDao;

@Component
@Transactional
public class PmsStaffBiz {

	@Autowired
	private PmsStaffDao pmsStaffDao;

	public DataGrid<PmsStaff> listWithPagination(PageParam pageParam, Map<String, Object> paramMap) {
		final DataGrid<PmsStaff> dataGrid = pmsStaffDao.listWithPagination(pageParam, paramMap);
		return dataGrid;
	}

	public long save(final PmsStaff staff) {
		final long ret = pmsStaffDao.save(staff);
		return ret;
	}

	public long updateImagePath(final PmsStaff staff) {
		final long ret = pmsStaffDao.updateImagePath(staff);
		return ret;
	}

	public long update(final PmsStaff staff) {
		final long ret = pmsStaffDao.update(staff);
		return ret;
	}

	public List<PmsStaff> findStaffsByArray(long[] ids) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("array", ids);
		final List<PmsStaff> list = pmsStaffDao.findStaffsByArray(paramMap);
		return list;
	}

	public long deleteByArray(long[] ids) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("array", ids);
		final long ret = pmsStaffDao.deleteByArray(paramMap);
		return ret;
	}

	public List<PmsStaff> getAll() {
		final List<PmsStaff> list = pmsStaffDao.getAll();
		return list;
	}

	public PmsStaff findStaffById(final long staffId) {
		final PmsStaff PmsStaff = pmsStaffDao.findStaffById(staffId);
		return PmsStaff;
	}

	
}
