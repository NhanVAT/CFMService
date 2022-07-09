package com.cfm.CFM.CFMService.repository;

import com.cfm.CFM.CFMService.entity.CFMRole;
import org.springframework.stereotype.Repository;

@Repository
public interface CFMRoleRepository extends BaseRepository<CFMRole, Long> {
    CFMRole findByName(String login);
}
