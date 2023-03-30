package com.example.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Agent;
import com.example.Repository.AgentRepository;
import com.example.Service.AgentService;

@Repository
public class AgentServiceImp implements AgentService {
	@Autowired
	AgentRepository agentrepository;
	@Override
	public Agent addAgent(Agent agent) {
		// TODO Auto-generated method stub
		return agentrepository.save(agent);
	}

	@Override
	public List<Agent> getAllAgent() {
		// TODO Auto-generated method stub
		return agentrepository.findAll();
	}

	@Override
	public void deleteAgent(int agent_id) {
		// TODO Auto-generated method stub
		agentrepository.deleteById(agent_id);
		
	}

	@Override
	public Agent updateAgent(Agent agent) {
		// TODO Auto-generated method stub
		Agent updateagent =agentrepository.findById(agent.getAgent_id()).get();
		updateagent.setAgent_name(agent.getAgent_name());
		updateagent.setAgent_salary(agent.getAgent_salary());
		return agentrepository.save(updateagent);
	}

	@Override
	public Agent getAgentbyID(int agent_id) {
		// TODO Auto-generated method stub
		return agentrepository.findById(agent_id).get();
	}

}
