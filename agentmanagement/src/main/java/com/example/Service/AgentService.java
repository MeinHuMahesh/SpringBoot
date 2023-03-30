package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Agent;
@Service
public interface AgentService {
	public Agent addAgent(Agent agent);
	public List<Agent> getAllAgent();
	public void deleteAgent(int agent_id);
	public Agent updateAgent(Agent agent);
	public Agent getAgentbyID(int agent_id);
	

}
