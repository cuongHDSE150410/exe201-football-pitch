package com.exe201.backend.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "type_yards")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TypeYard {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type_name")
    private String typeName;
}
