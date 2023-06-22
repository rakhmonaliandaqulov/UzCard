package com.example.entity;

import com.example.enums.ProfileRole;
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
@Table(name = "profile")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProfileEntity {
    @Id
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    String id;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "created_date")
    LocalDateTime created_date;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    GeneralStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    ProfileRole role;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;
}
