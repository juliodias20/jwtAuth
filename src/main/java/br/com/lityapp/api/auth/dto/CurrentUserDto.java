package br.com.lityapp.api.auth.dto;

import lombok.Data;

@Data
public class CurrentUserDto {
    private Integer id;

    //private Integer companyId;

    private String name;

    private String cpf;

    private String username;

    private String accessToken;
}
