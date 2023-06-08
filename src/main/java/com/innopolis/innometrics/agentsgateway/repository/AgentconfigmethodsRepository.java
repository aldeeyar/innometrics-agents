package com.innopolis.innometrics.agentsgateway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innopolis.innometrics.agentsgateway.entity.Agentconfigmethods;

@Repository
public interface AgentconfigmethodsRepository extends JpaRepository<Agentconfigmethods, Integer> {
    List<Agentconfigmethods> findByAgentId(Integer agentId);

    Agentconfigmethods findByAgentidAndOperation(Integer agentId, String operation);

}
