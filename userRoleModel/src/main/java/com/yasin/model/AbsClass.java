package com.yasin.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import static javax.persistence.GenerationType.IDENTITY;


@MappedSuperclass
public abstract class AbsClass{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;

    @Column(name = "NAME", unique = true, nullable = false, length = 30)
    private String name;

    @Column(name = "CREATE_DATE")
    private Date create;

    @Column(name = "UPDATE_DATE")
    private Date update;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getCreate() { return create; }
    public void setCreate(Date create) { this.create = create; }

    public Date getUpdate() { return update; }
    public void setUpdate(Date update) { this.update = update; }

}
