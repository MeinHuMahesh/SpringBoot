package com.example.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="SpringBoot_Faculty")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {
	@Id
	int faculty_id;
	@NonNull
	String faculty_name;
	@OneToMany(mappedBy = "faculty",cascade = CascadeType.ALL)
	
	List<Course> courses;
	
}
