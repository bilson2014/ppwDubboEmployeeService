package com.paipianwang.pat.facade.employee.service.dao.impl;




import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.paipianwang.pat.common.core.dao.impl.BaseDaoImpl;
import com.paipianwang.pat.facade.employee.entity.PmsStaff;
import com.paipianwang.pat.facade.employee.service.dao.PmsStaffDao;
@Repository
public class PmsStaffDaoImpl extends BaseDaoImpl<PmsStaff> implements PmsStaffDao {

	public static final String SQL_SAVE= "save";
	public static final String SQL_UPDATE_IMAGEPATH= "updateImagePath";
	public static final String SQL_FIND_STAFFS_BYARRAY= "findStaffsByArray";
	public static final String SQL_DELETE_BYARRAY= "deleteByArray";
	public static final String SQL_GET_ALL= "getAll";
	public static final String SQL_FIND_STAFF_BYID= "findStaffById";
	
	@Autowired
	private SqlSessionTemplate sessionTemplate = null;

	@Override
	public long save(final PmsStaff staff) {
		return sessionTemplate.insert(getStatement(SQL_SAVE),staff);
	}

	@Override
	public long updateImagePath(final PmsStaff staff) {
		return sessionTemplate.insert(getStatement(SQL_UPDATE_IMAGEPATH),staff);
	}

	@Override
	public List<PmsStaff> findStaffsByArray(Map<String, Object> paramMap) {
		return sessionTemplate.selectList(getStatement(SQL_FIND_STAFFS_BYARRAY),paramMap);
	}

	@Override
	public long deleteByArray(Map<String, Object> paramMap) {
		return sessionTemplate.delete(getStatement(SQL_DELETE_BYARRAY),paramMap);
	}

	@Override
	public List<PmsStaff> getAll() {
		return sessionTemplate.selectList(getStatement(SQL_GET_ALL));
	}

	@Override
	public PmsStaff findStaffById(long staffId) {
		return sessionTemplate.selectOne(getStatement(SQL_FIND_STAFF_BYID),staffId);
	}


}
