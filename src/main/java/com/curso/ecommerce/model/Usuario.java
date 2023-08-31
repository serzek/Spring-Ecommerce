package com.curso.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {

    private Long id;
    private String name;
    private String userName;
    private String email;
    private String phone;
    private String addres;
    private String userType;
    private String password;

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", addres='" + addres + '\'' +
                ", userType='" + userType + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
