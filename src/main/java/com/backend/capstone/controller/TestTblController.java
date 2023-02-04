package com.backend.capstone.controller;

import com.backend.capstone.json.TestTblJson;
import com.backend.capstone.service.TestTblService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestTblController {

    private final TestTblService testTblService;

    @GetMapping(value = "/api/testtbl")
    public ResponseEntity<List<TestTblJson>> getAllTestTbl() {
        return new ResponseEntity<>(testTblService.getAllTextTbl(), HttpStatus.OK);
    }

}
