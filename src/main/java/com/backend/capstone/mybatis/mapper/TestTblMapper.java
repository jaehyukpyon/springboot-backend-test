package com.backend.capstone.mybatis.mapper;

import com.backend.capstone.mybatis.dto.TestTblDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TestTblMapper {

    public List<TestTblDto> allTestTbl();

}
