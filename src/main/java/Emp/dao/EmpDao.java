package Emp.dao;

import java.util.List;

import Emp.vo.Emp;

public interface EmpDao {

	int insert(Emp emp);

	int deleteByEmpno(Integer empno);

	int updateByEmpno(Emp emp);

	Emp selectByEmpno(Integer empno);

	List<Emp> selectAll() throws ClassNotFoundException;

}