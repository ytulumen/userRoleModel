package com.yasin.model;

/**
 * Created by yasintulumen on 18/07/2017.
 */

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "ROLES", catalog = "testdbyasin", uniqueConstraints = {
        @UniqueConstraint(columnNames = "NAME")})

public class Roles extends AbsClass{

}
