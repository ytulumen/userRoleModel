package com.yasin.model;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;


@MappedSuperclass
public abstract class AbsClass{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "NAME", unique = true, nullable = false, length = 30)
    private String name;

    @Column(name = "CREATE_DATE", unique = true, nullable = false, length = 30)
    private Date create;

    @Column(name = "UPDATE_DATE", unique = true, nullable = false, length = 30)
    private Date update;

    @Column(name = "PASSWORD", unique = true, nullable = false, length = 30)
    private String password;



    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getCreate() { return create; }
    public void setCreate(Date create) { this.create = create; }

    public Date getUpdate() { return update; }
    public void setUpdate(Date update) { this.update = update; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return this.getClass().toString() +"[id=" + id + ", name=" + name
                + ", create_date=" + create + ", update_date=" + update + "]";
    }
}
