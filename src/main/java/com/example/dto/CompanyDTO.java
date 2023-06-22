package com.example.dto;

import com.example.enums.CompanyStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompanyDTO {
     String id;
     String name;
     String address;
     String contact;
     LocalDateTime createdDate;
     CompanyStatus role;
     Boolean code;
     String username;
     String password;
}
