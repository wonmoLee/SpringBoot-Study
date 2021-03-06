package com.spring.securityex01.model;

import lombok.NoArgsConstructor;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//ORM - Object Relation Mapping

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String password;
	private String email;
	private String role; //ROLE_USER, ROLE_ADMIN
	//OAuth를 위해 구성한 추가 필드 2개
	private String provider;
	private String providerId;
	@CreationTimestamp
	private Timestamp createDate;
}
