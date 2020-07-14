package com.luolight.SeaweedS.utils;

import redis.clients.jedis.Jedis;

public class RedisUtil {

	public static void setString(String name, String value) {
		Jedis jedis = RedisPool.getJedis();
		jedis.set(name, value);
	}
	
	public static String getString(String name) {
		Jedis jedis = RedisPool.getJedis();
		return jedis.get(name);
	}
}
