package com.typeDefinitions;

import com.supportUtils.DataTransformer;
import com.supportUtils.PropUtil;
import io.cucumber.java.ParameterType;

import java.util.Map;

public class ParameterTypes {
    @ParameterType("\\$PROP:.*|\\$EXT:.*")
    public String fieldType(String data) {
        String value = null;
        if (data.startsWith("$EXT:")) {
            String[] paramInfo = data.replaceAll("\\$EXT:", "").split("~");
            value = DataTransformer.getData(paramInfo[0]).get(paramInfo[1]);
        } else if (data.startsWith("$PROP:"))
            value = PropUtil.getProperty(data.replaceAll("\\$PROP:", ""));
        return value;
    }

    @ParameterType("\\$EXT:.*")
    public Map<String, String> mapType(String data) {
        Map<String, String> value = null;
        if (data.startsWith("$EXT:")) {
            value = DataTransformer.getData(data.replaceAll("\\$EXT:", ""));
        }
        return value;
    }

}
