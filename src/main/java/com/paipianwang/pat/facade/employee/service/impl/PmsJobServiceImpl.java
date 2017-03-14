package com.paipianwang.pat.facade.employee.service.impl;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.employee.entity.PmsJob;
import com.paipianwang.pat.facade.employee.service.PmsJobFacade;
import com.paipianwang.pat.facade.employee.service.biz.PmsJobBiz;


@Service("pmsJobFacade")
public class PmsJobServiceImpl implements PmsJobFacade{

	@Autowired
	private PmsJobBiz pmsJobBiz;

	@Override
	public DataGrid<PmsJob> listWithPagination(PageParam pageParam, Map<String, Object> paramMap) {
		final DataGrid<PmsJob> dataGrid = pmsJobBiz.listWithPagination(pageParam,paramMap);
		return dataGrid;
	}

	@Override
	public long update(final PmsJob job) {
		final long ret = pmsJobBiz.update(job);
		return ret;
	}

	@Override
	public long save(final PmsJob job) {
		final long ret = pmsJobBiz.save(job);
		return ret;
	}

	@Override
	public long delete(final long[] ids) {
		final long ret = pmsJobBiz.delete(ids);
		return ret;
	}

	@Override
	public List<PmsJob> getAll() {
		final List<PmsJob> list = pmsJobBiz.getAll();
		return list;
	}

	@Override
	public PmsJob findJobById(final Long jobId) {
		final PmsJob pmsJob = pmsJobBiz.findJobById(jobId);
		return pmsJob;
	}

}
