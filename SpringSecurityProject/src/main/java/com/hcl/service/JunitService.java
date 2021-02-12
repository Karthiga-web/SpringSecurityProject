package com.hcl.service;

import com.hcl.entity.JunitEntity;

public interface JunitService {
	public JunitEntity findIfUserExists(String userid);
}
