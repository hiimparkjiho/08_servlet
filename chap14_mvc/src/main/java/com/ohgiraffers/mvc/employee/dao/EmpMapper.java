package com.ohgiraffers.mvc.employee.dao;

import com.ohgiraffers.mvc.employee.dto.EmpDTO;
import com.ohgiraffers.mvc.employee.dto.EmpInsertDTO;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper {
//    @Results( id = "emp", value = {
//            @Result(id = true, property = "emp_id", column = "EMP_ID"),
//            @Result(property="empName", column="EMP_NAME"),
//            @Result(property="email", column="EMAIL"),
//            @Result(property="phone", column="PHONE")
//    })
//    @Select(
//           "        SELECT\n" +
//                   "            EMP_ID,\n" +
//                   "            EMP_NAME,\n" +
//                   "            EMAIL,\n" +
//                   "            PHONE\n" +
//                   "        FROM EMPLOYEE\n" +
//                   "        WHERE EMP_ID = #{empId}"
//    )

    EmpDTO selectByEmpId(int empId);

    List<EmpDTO> selectAllEmp();

    int insert(EmpInsertDTO insert);

    int delete(EmpDTO empDTO);
}
