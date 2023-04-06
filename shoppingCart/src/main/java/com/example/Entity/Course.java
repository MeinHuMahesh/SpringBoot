package com.example.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="SpringBoot_course")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	@Id
	int course_id;
	@NonNull
	String course_name;
	@ManyToOne(fetch =FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="c_id")
	
	Faculty faculty;

}
