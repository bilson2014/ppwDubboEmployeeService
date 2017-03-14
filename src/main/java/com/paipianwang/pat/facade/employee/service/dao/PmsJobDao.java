package com.paipianwang.pat.facade.employee.service.dao;





import java.util.List;

import com.paipianwang.pat.common.core.dao.BaseDao;
import com.paipianwang.pat.facade.employee.entity.PmsJob;

public interface PmsJobDao extends BaseDao<PmsJob>{

	public long save(final PmsJob job);

	public void delete(final long jobId);

	public List<PmsJob> getAll();

	public PmsJob findJobById(final Long jobId);



}
