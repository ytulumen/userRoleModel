package com.yasin.model;

/**
 * Created by yasintulumen on 18/07/2017.
 */
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Roles", catalog = "testdbyasin", uniqueConstraints = {
        @UniqueConstraint(columnNames = "NAME")})

@NamedQueries(@NamedQuery(
        name = "findRoleByName",
        query = "SELECT e FROM Roles e WHERE e.name = :name")
)
public class Roles extends AbsClass {

}
