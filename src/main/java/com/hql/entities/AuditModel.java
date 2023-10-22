package com.hql.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "date_creation")
@Temporal(TemporalType.TIMESTAMP)
@CreationTimestamp
private Date dateCreation;
}
