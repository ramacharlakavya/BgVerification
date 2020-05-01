package com.cg.backgroundverification.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.backgroundverification.dto.VerificationDto;

public interface BcgDaoRepository extends JpaRepository<VerificationDto,Integer> {

}
