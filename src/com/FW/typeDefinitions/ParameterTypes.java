package com.FW.typeDefinitions;

import com.FW.supportUtils.DataTransformer;
import com.FW.supportUtils.PropUtil;
import io.cucumber.java.ParameterType;

import java.util.Map;

public class ParameterTypes {
    @ParameterType("<EXT:.*>|<PROP:.*>")
    public String fieldType(String data) {
        String value = null;
        if (data.startsWith("<EXT:")) {
            String[] paramInfo = data.replaceAll("(<EXT:)|>", "").split("~");
            value = DataTransformer.getData(paramInfo[0]).get(paramInfo[1]);
        } else if (data.startsWith("<PROP:"))
            value = PropUtil.getProperty(data.replaceAll("(<PROP:)|>", ""));
        return value;
    }

    @ParameterType("<EXT:.*>")
    public Map<String, String> mapType(String data) {
        Map<String, String> map = null;
        if (data.startsWith("<EXT:")) {
            String paramInfo = data.replaceAll("(<EXT:)|>", "");
            map = DataTransformer.getData(paramInfo);
        }
        return map;
    }
}
