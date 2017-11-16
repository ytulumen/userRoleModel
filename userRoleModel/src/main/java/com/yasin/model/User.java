package com.yasin.model;

/**
 * Created by yasintulumen on 18/07/2017.
 */
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "User", catalog = "testdbyasin", uniqueConstraints = {
        @UniqueConstraint(columnNames = "NAME") })

@NamedQueries(@NamedQuery(
        name = "findUserByName",
        query = "SELECT e FROM User e WHERE e.name = :name")
)
public class User extends AbsClass {

    @Column(name = "PASSWORD", unique = true, nullable = false, length = 30)
    private String password;

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }


}
