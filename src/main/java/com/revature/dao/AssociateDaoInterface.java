package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.entity.Associate;
import org.springframework.stereotype.Component;


public interface AssociateDaoInterface extends JpaRepository<Associate, Integer>{

}
