package com.luolight.SeaweedS.configs;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class SessionInitializer extends AbstractHttpSessionApplicationInitializer
{
	public SessionInitializer() 
	{
		super(SessionConfig.class);
	}
}
