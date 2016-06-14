package com.qsshm.framework.base.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户service
 * @author ty
 * @date 2015年1月13日
 */
@Service
@Transactional(readOnly = true)
public class UserService  {
	
	/**加密方法*/
	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;	//盐长度

	
}
