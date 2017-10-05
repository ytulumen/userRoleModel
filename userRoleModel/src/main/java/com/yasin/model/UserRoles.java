package com.yasin.model;

/**
 * Created by yasintulumen on 18/07/2017.
 */

import javax.persistence.*;

@Entity
@Table(name = "USERROLES", catalog = "testdbyasin", uniqueConstraints = {
        @UniqueConstraint(columnNames = "NAME") })
public class UserRoles extends AbsClass {

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.DETACH)
    @JoinColumn(referencedColumnName = "ID", name = "USER_ID")
    private User user;

    @ManyToOne( targetEntity = Roles.class, cascade = CascadeType.DETACH)
    @JoinColumn(referencedColumnName = "ID", name = "ROLE_ID")
    private Roles role;

    public UserRoles() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
