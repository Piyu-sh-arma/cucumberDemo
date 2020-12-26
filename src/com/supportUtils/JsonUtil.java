package com.supportUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class JsonUtil {

    private static final Logger log = Logger.getLogger(JsonUtil.class);

    public static Map<String, Map<String, String>> loadJsonData(String testDataFilePath) {
        Map<String, Map<String, String>> map = null;
        try {
            Gson gson = new Gson();
            map = gson.fromJson(new FileReader(testDataFilePath), new TypeToken<HashMap<String, HashMap<String, String>>>() {}.getType());
        } catch (Exception e) {
            log.error("Failed to load json data");
            log.error(e.getStackTrace());
        }

        return map;
    }


}
