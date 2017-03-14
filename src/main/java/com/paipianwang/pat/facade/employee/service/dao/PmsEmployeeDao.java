package com.paipianwang.pat.facade.employee.service.dao;



import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.core.dao.BaseDao;
import com.paipianwang.pat.facade.employee.entity.PmsEmployee;

public interface PmsEmployeeDao extends BaseDao<PmsEmployee>{

	public PmsEmployee doLogin(final Map<String, Object> paramMap);

	public long checkPhoneNumber(final String phoneNumber);

	public List<PmsEmployee> getEmployeesWithVersionManager(final String phoneNumber);

	public long editPasswordById(final PmsEmployee originalEmployee);
	/**
	 * 获取项目协同人 目前业务规则:协同人身份为视频管家和视频管家指导
	 * 
	 * @return employeeList
	 */
	public List<PmsEmployee> findEmployeeToSynergy();
	/**
	 * 保存员工信息，不包含员工与角色之间的关系
	 * 
	 * @param employer
	 *            员工实体
	 * @return 员工ID 获取 员工ID 方式，employer.getEmployerId();
	 */
	public long save(final PmsEmployee employee);
	/**
	 * 仅保存员工与角色之间的关系
	 * 
	 * @param link
	 *            员工角色关系实体
	 */
	public long saveRelativity(final PmsEmployee employee);
	/**
	 * 更新照片路径
	 * 
	 * @param path
	 * @return
	 */
	public long updateImagePath(final PmsEmployee employee);

	public PmsEmployee findEmployerById(final long employeeId);

	public long  deleteEmployeeRoleLink(final long employeeId);



}
