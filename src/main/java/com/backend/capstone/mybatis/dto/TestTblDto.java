package com.backend.capstone.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestTblDto {

    private int id;
    private String username;
    private String email;
    private int age;

}
