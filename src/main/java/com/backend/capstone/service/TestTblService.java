package com.backend.capstone.service;

import com.backend.capstone.json.TestTblJson;
import com.backend.capstone.mybatis.dto.TestTblDto;
import com.backend.capstone.mybatis.mapper.TestTblMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TestTblService {

    private final TestTblMapper testTblMapper;

    public List<TestTblDto> getAllTextTbl() {
        List<TestTblDto> all =  testTblMapper.allTestTbl();

//        List<TestTblJson> result = all.stream()
//                .map(item -> new TestTblJson(item)).collect(Collectors.toList());
        return all;
    }

}
