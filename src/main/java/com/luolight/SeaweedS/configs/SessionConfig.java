package com.luolight.SeaweedS.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import com.luolight.SeaweedS.utils.Constans;
import com.luolight.SeaweedS.utils.ProperU;

@EnableRedisHttpSession
public class SessionConfig 
{
	@Bean
	public JedisConnectionFactory connectionFactory()
	{
		JedisConnectionFactory connection = new JedisConnectionFactory();
		connection.setPort(Integer.parseInt(ProperU.read(ProperU.read(Constans.PROSOURCE, "redis"), "port")));
		connection.setHostName(ProperU.read(ProperU.read(Constans.PROSOURCE, "redis"), "addr"));
		connection.setPassword(ProperU.read(ProperU.read(Constans.PROSOURCE, "redis"), "auth"));
		return connection;
	}

}
