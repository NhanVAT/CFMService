package com.cfm.CFM.CFMService.entity;

import com.cfm.CFM.CFMService.util.Constants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.util.Set;


/**
 * A user.
 */
@Table(name = "cfm_user")
@Data
@Entity
@Getter
@Setter
public class CFMUser extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    @Pattern(regexp = Constants.LOGIN_REGEX)
    @Size(min = 1, max = 50)
    @Column(name = "login")
    private String login;

    @JsonIgnore
    @NotNull
    @Size(min = 60, max = 60)
    @Column(name = "password_hash")
    private String password;

    @Size(max = 50)
    @Column(name = "first_name")
    private String firstName;

    @Size(max = 50)
    @Column(name = "last_name")
    private String lastName;

    @Email
    @Size(min = 5, max = 254)
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "activated")
    private boolean activated = false;

    @Size(min = 2, max = 10)
    @Column(name = "lang_key")
    private String langKey;

    @Size(max = 256)
    @Column(name = "image_url")
    private String imageUrl;

    @Size(max = 20)
    @Column(name = "activation_key")
    @JsonIgnore
    private String activationKey;

    @Size(max = 20)
    @Column(name = "reset_key")
    @JsonIgnore
    private String resetKey;

    @Column(name = "reset_date")
    private Instant resetDate = null;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cfm_user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})

    private Set<CFMRole> roles;
}
