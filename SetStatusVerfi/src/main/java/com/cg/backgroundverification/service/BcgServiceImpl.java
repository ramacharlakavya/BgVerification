package com.cg.backgroundverification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.backgroundverification.dao.BcgDaoRepository;
import com.cg.backgroundverification.dto.VerificationDto;

@Service
public class BcgServiceImpl  implements BcgService{

	@Autowired
	BcgDaoRepository bcgdao;
	@Override
	public VerificationDto setStatus(VerificationDto verificationdto) {
		// TODO Auto-generated method stub
		return bcgdao.save(verificationdto);
	}

}
