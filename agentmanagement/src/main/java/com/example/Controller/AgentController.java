package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Agent;
import com.example.Service.AgentService;

@RestController
public class AgentController {
	@Autowired
	AgentService agentservice;
	@GetMapping(value="/getagents")
	public List<Agent> findAllAgent(){
		return agentservice.getAllAgent();	
	}
	@PostMapping(value="/postagent")
	public Agent saveagent(@RequestBody Agent agent) {
		return agentservice.addAgent(agent);
	}
	@PutMapping(value="/updateagent")
	public Agent updateAgent(@RequestBody Agent agent) {
		return agentservice.updateAgent(agent);
	}
	@GetMapping(value="/getagent/{agent_id}")
	public Agent getagentbyID(@PathVariable int agent_id) {
		return agentservice.getAgentbyID(agent_id);
	}
	@DeleteMapping(value="/delagent/{agent_id}")
	public String deleteAgent(@PathVariable int agent_id)
	{
		agentservice.deleteAgent(agent_id);
		return "Agent Deleted Successfully";
	}
}
