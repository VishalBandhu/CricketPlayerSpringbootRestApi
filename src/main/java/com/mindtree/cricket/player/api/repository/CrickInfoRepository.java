package com.mindtree.cricket.player.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.cricket.player.api.model.CrickInfo;
@Repository
public interface CrickInfoRepository extends JpaRepository<CrickInfo, String> {

}
