package com.yasin.model;

/**
 * Created by yasintulumen on 18/07/2017.
 */

import javax.persistence.*;

@Entity
@Table(name = "UserRoles", catalog = "testdbyasin", uniqueConstraints = {
        @UniqueConstraint(columnNames = "NAME") })


@org.hibernate.annotations.NamedQueries(@org.hibernate.annotations.NamedQuery(
        name = "findUserRoleByName",
        query = "SELECT e FROM UserRoles e WHERE e.name = :name")
)

public class UserRoles extends AbsClass {

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "ID", name = "USER_ID")
    private User user;

    @ManyToOne( targetEntity = Roles.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "ID", name = "ROLE_ID")
    private Roles role;

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
