package com.paipianwang.pat.facade.employee.service.biz;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.employee.entity.PmsJob;
import com.paipianwang.pat.facade.employee.service.dao.PmsJobDao;


@Service
@Transactional
public class PmsJobBiz {

	@Autowired
	private PmsJobDao pmsJobDao;

	public DataGrid<PmsJob> listWithPagination(PageParam pageParam, Map<String, Object> paramMap) {
		final DataGrid<PmsJob> dataGrid = pmsJobDao.listWithPagination(pageParam,paramMap);
		return dataGrid;
	}

	public long update(final PmsJob job) {
		final long ret = pmsJobDao.update(job);
		return ret;
	}

	public long save(final PmsJob job) {
		final long ret = pmsJobDao.save(job);
		return ret;
	}

	public long delete(final long[] ids) {
		if(ids != null && ids.length > 0){
			for (final long id : ids) {
				pmsJobDao.delete(id);
			}
		}
		return 0l;
	}

	public List<PmsJob> getAll() {
		final List<PmsJob> list = pmsJobDao.getAll();
		return list;
	}

	public PmsJob findJobById(final Long jobId) {
		final PmsJob pmsJob = pmsJobDao.findJobById(jobId);
		return pmsJob;
	}


	
}
