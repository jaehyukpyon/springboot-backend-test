package com.backend.capstone.json;

import com.backend.capstone.mybatis.dto.TestTblDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TestTblJson {

    private int id;
    private String username;
    private String email;
    private int age;

    public TestTblJson(TestTblDto testTblDto) {
        this.id = testTblDto.getId();
        this.username = testTblDto.getUsername();
        this.email = testTblDto.getEmail();
        this.age = testTblDto.getAge();
    }

}
