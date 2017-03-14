package com.paipianwang.pat.facade.employee.service.biz;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.common.util.ValidateUtil;
import com.paipianwang.pat.facade.employee.entity.PmsEmployee;
import com.paipianwang.pat.facade.employee.service.dao.PmsEmployeeDao;


@Service
@Transactional
public class PmsEmployeeBiz {

	@Autowired
	private PmsEmployeeDao pmsEmployeeDao;

	public PmsEmployee doLogin(String loginName, String password) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("loginName", loginName);
		paramMap.put("password", password);
		return pmsEmployeeDao.doLogin(paramMap);
	}

	public long checkPhoneNumber(final String phoneNumber) {
		final long ret = pmsEmployeeDao.checkPhoneNumber(phoneNumber);
		return ret;
	}

	public List<PmsEmployee> getEmployeesWithVersionManager(final String phoneNumber) {
		final List<PmsEmployee> list = pmsEmployeeDao.getEmployeesWithVersionManager(phoneNumber);
		return list;
	}

	public long editPasswordById(final PmsEmployee originalEmployee) {
		final long ret = pmsEmployeeDao.editPasswordById(originalEmployee);
		return ret;
	}

	public List<PmsEmployee> findEmployeeToSynergy() {
		final List<PmsEmployee> list = pmsEmployeeDao.findEmployeeToSynergy();
		return list;
	}

	public DataGrid<PmsEmployee> listWithPagination(Map<String, Object> paramMap, PageParam pageParam) {
		return pmsEmployeeDao.listWithPagination(pageParam, paramMap);
	}

	public long save(final PmsEmployee employee) {
		long ret = pmsEmployeeDao.save(employee);
		pmsEmployeeDao.saveRelativity(employee);
		return ret;
	}

	public long updateImagePath(final PmsEmployee employee) {
		long ret = pmsEmployeeDao.updateImagePath(employee);
		return ret;
	}

	public PmsEmployee findEmployerById(final long employeeId) {
		final PmsEmployee employee = pmsEmployeeDao.findEmployerById(employeeId);
		return employee;
	}

	public void updateWidthRelation(final PmsEmployee employee) {
		final long id = employee.getEmployeeId();
		pmsEmployeeDao.deleteEmployeeRoleLink(id);
		pmsEmployeeDao.update(employee);

		final List<Long> roleIds = employee.getRoleIds();
		if (ValidateUtil.isValid(roleIds)) {
			// 排除没有权限的弊端
			if (roleIds.size() == 1 && roleIds.get(0) == 0) {

			} else {
				pmsEmployeeDao.saveRelativity(employee);
			}
		}
	};

	
	
}
