package com.sanza.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-02 14:34
 **/
@Component
public class Bean1 {

	@Autowired
	Bean2 bean2;

}
