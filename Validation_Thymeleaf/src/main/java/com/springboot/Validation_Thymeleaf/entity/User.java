package com.springboot.Validation_Thymeleaf.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Validation
    @NotBlank(message = "Full Name cannot be left blank")
    @Size(min = 2, message = "Full name must be at least 3 characters")
    private String fullName;

    @Column(unique = true, nullable = false)
    private String userName;

    @NotBlank(message = "Pass Word cannot be left blank")
    @Size(min = 6, message = "Pass Word must be at least 6 characters")
    private String password;

    @NotBlank(message = "Email cannot be left blank")
    @Email(message = "Email not valid - @")
    private String email;

    @NotBlank(message = "Your Phone cannot be left blank")
    @Pattern(regexp = "^\\+?[0-9]{10,11}$", message = "Your Phone is 10 - 11 number")
    private String phone;

    private String address;
    private Boolean isActive;
}
