package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="SpringBoot_agent")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agent {
	@Id
	int agent_id;
	String agent_name;
	float agent_salary;
}
