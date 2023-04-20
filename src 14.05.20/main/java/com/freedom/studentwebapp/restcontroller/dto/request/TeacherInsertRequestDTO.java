package com.freedom.studentwebapp.restcontroller.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TeacherInsertRequestDTO {

//    private Integer id; //insert-de id-i lazim deill
    private String name;
//    @JsonProperty("lastname")
    private String surname;
    private BigDecimal salary;
    private Integer universityId;

}
