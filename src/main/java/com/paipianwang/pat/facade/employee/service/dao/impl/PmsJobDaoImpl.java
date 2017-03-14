package com.paipianwang.pat.facade.employee.service.dao.impl;





import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paipianwang.pat.common.core.dao.impl.BaseDaoImpl;
import com.paipianwang.pat.facade.employee.entity.PmsJob;
import com.paipianwang.pat.facade.employee.service.dao.PmsJobDao;
@Repository
public class PmsJobDaoImpl extends BaseDaoImpl<PmsJob> implements PmsJobDao {

	public static final String SQL_SAVE = "save";
	public static final String SQL_DELETE = "delete";
	public static final String SQL_GETALL = "getAll";
	public static final String SQL_FIND_JOB_BYID = "findJobById";
	@Autowired
	private SqlSessionTemplate sessionTemplate = null;
	@Override
	public long save(final PmsJob job) {
		return sessionTemplate.insert(getStatement(SQL_SAVE),job);
	}
	@Override
	public void delete(long jobId) {
		sessionTemplate.delete(getStatement(SQL_DELETE),jobId);
	}
	@Override
	public List<PmsJob> getAll() {
		return sessionTemplate.selectList(getStatement(SQL_GETALL));
	}
	@Override
	public PmsJob findJobById(Long jobId) {
		return sessionTemplate.selectOne(getStatement(SQL_FIND_JOB_BYID),jobId);
	}
}
