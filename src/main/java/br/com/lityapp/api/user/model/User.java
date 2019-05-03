package br.com.lityapp.api.user.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    private Integer referralId;

    private String name;

    private String email;

    private String cpf;

    private String telephone;

    private String password;

    private String image;

    private boolean autoPrintOrder;

    private boolean deleted;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModified;
}