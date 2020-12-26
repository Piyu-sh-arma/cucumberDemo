package com.supportUtils;

import org.apache.log4j.Logger;

import java.util.Map;

/**
 * @author Piyush
 */
public class DataTransformer {

    private static final Logger log = Logger.getLogger(DataTransformer.class);
    private static Map<String, Map<String, String>> map = null;

    /************************************************
     * Purpose - Based on TestData.Source property in Config.properties file,
     * 			the data will be pulled from source
     *
     *************************************************/
    public static void initDataFromSource() {
        if (null != map)
            return;
        String source = PropUtil.getProperty("TestData.Source").trim().toUpperCase();
        switch (source) {
            case "EXCEL":
                String testDataFilePath = PropUtil.getProperty("TestData.ExcelFilePath");
                String testSheetName = PropUtil.getProperty("TestData.ExcelTestSheetName");
                map = ExcelUtil.loadExcelData(testDataFilePath, testSheetName);
                break;

            case "JSON":
                String jsonFilePath = PropUtil.getProperty("TestData.JSONFilePath");
                map = JsonUtil.loadJsonData(jsonFilePath);
                break;

            case "CSV":
                // Future code to be added in case needed.
            case "db":
                // Future code to be added in case needed.
            default:
                break;
        }
    }

    /************************************************
     * Purpose -
     *
     *************************************************/
    public static Map<String, String> getData(String testKey) {
        if (map != null) {
            if (map.containsKey(testKey)) {
                return map.get(testKey);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getData("f1"));
    }

}
