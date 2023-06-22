package com.example.entity;

import com.example.enums.GeneralStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "client")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientEntity {
    @Id
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "middle_name")
    String middleName;

    @Column(name = "created_date")
    LocalDateTime created_date;

    @Column(name = "phone")
    String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    GeneralStatus status;

    @Column(name = "passport_series")
    String passportSeries;

    @Column(name = "passport_number")
    Integer passportNumber;
}
