package com.exe201.backend.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "provinces")
@Getter
@Setter
public class ProvinceEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "province_name")
    private String provinceName;

}
