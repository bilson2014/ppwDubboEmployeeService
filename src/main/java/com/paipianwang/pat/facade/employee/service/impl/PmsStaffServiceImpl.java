package com.paipianwang.pat.facade.employee.service.impl;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.employee.entity.PmsStaff;
import com.paipianwang.pat.facade.employee.service.PmsStaffFacade;
import com.paipianwang.pat.facade.employee.service.biz.PmsStaffBiz;


@Service("pmsStaffFacade")
public class PmsStaffServiceImpl implements PmsStaffFacade{

	@Autowired
	private PmsStaffBiz pmsStaffBiz;

	@Override
	public DataGrid<PmsStaff> listWithPagination(PageParam pageParam, Map<String, Object> paramMap) {
		final DataGrid<PmsStaff> ret = pmsStaffBiz.listWithPagination(pageParam,paramMap);
		return ret;
	}

	@Override
	public long save(final PmsStaff staff) {
		pmsStaffBiz.save(staff);
		final long staffId = staff.getStaffId();
		return staffId;
	}

	@Override
	public long updateImagePath(final PmsStaff staff) {
		final long ret = pmsStaffBiz.updateImagePath(staff);
		return ret;
	}

	@Override
	public long update(final PmsStaff staff) {
		final long ret = pmsStaffBiz.update(staff);
		return ret;
	}

	@Override
	public List<PmsStaff> findStaffsByArray(final long[] ids) {
		final List<PmsStaff> list = pmsStaffBiz.findStaffsByArray(ids);
		return list;
	}

	@Override
	public long deleteByArray(final long[] ids) {
		final long ret = pmsStaffBiz.deleteByArray(ids);
		return ret;
	}

	@Override
	public List<PmsStaff> getAll() {
		final List<PmsStaff> list = pmsStaffBiz.getAll();
		return list;
	}

	@Override
	public PmsStaff findStaffById(final long staffId) {
		final PmsStaff PmsStaff = pmsStaffBiz.findStaffById(staffId);
		return PmsStaff;
	}

}
