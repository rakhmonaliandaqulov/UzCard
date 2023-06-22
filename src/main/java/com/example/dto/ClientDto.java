package com.example.dto;

import com.example.enums.GeneralStatus;
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
public class ClientDto {
    String id;
    String name;
    String surname;
    String middleName;
    LocalDateTime created_date;
    String phone;
    GeneralStatus status;
    String passportSeries;
    Integer passportNumber;
}
