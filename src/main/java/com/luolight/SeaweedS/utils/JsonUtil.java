package com.luolight.SeaweedS.utils;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class JsonUtil {

	public static Map<String, Object> JsonStringToMap(String json) {
        if (StringUtil.isBlank(json)) {
            return new HashMap<String, Object>();
        }
        try {
            Gson gson = new Gson();
            return (Map<String, Object>) gson.fromJson(json, new HashMap<String, Object>().getClass());
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return new HashMap<String, Object>();
        }
    }

    public static String toJson(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        Gson gson = new Gson();
        return gson.toJson(map);
    }
}
