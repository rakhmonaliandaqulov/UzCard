package com.example.dto;

import com.example.enums.ProfileRole;
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
public class ProfileDTO {
    String id;
    String name;
    String surname;
    LocalDateTime created_date;
    GeneralStatus status;
    ProfileRole role;
    String username;
    String password;
}
