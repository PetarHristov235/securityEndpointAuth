package com.example.demo.entity;

import com.example.demo.entity.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userIdSeqGenerator")
    @SequenceGenerator(name = "userIdSeqGenerator", sequenceName = "users_id_seq", allocationSize = 1)
    private Long id;
    @Column(nullable = false, length = 32)
    private String username;
    @Column(nullable = false, unique = true, length = 128)
    private String email;
    @Column(nullable = false, length = 64)
    private String name;
    @Column(nullable = false, length = 128)
    private String password;
    private boolean active = true;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role roles;
}