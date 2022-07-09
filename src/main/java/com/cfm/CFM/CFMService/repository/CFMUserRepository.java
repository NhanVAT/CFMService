package com.cfm.CFM.CFMService.repository;

import com.cfm.CFM.CFMService.entity.CFMUser;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CFMUserRepository extends BaseRepository<CFMUser, Long> {
    Optional<CFMUser> findByLogin(String login);
}
