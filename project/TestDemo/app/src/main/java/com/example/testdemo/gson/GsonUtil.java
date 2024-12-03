package com.example.testdemo.gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class GsonUtil {

    private String json;
    private String jsonarea;
    private TestBean bean;
    private List<TestBean> beans;

    public GsonUtil() {
        this.json = "{\n" +
                "            \"areaCode\": \"110101\",\n" +
                "            \"areaName\": \"东城区\"\n" +
                "          }";

        this.jsonarea = " [\n" +
                "          {\n" +
                "            \"areaCode\": \"110101\",\n" +
                "            \"areaName\": \"东城区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110102\",\n" +
                "            \"areaName\": \"西城区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110105\",\n" +
                "            \"areaName\": \"朝阳区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110106\",\n" +
                "            \"areaName\": \"丰台区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110107\",\n" +
                "            \"areaName\": \"石景山区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110108\",\n" +
                "            \"areaName\": \"海淀区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110109\",\n" +
                "            \"areaName\": \"门头沟区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110111\",\n" +
                "            \"areaName\": \"房山区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110112\",\n" +
                "            \"areaName\": \"通州区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110113\",\n" +
                "            \"areaName\": \"顺义区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110114\",\n" +
                "            \"areaName\": \"昌平区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110115\",\n" +
                "            \"areaName\": \"大兴区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110116\",\n" +
                "            \"areaName\": \"怀柔区\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"areaCode\": \"110117\",\n" +
                "            \"areaName\": \"平谷区\"\n" +
                "          }\n" +
                "        ]";
    }

    public TestBean parseJson(){
        bean = new TestBean();

        try {
            JSONObject ojson = new JSONObject(json);

            bean.setCode(ojson.getString("areaCode"));
            bean.setName(ojson.getString("areaName"));
            return bean;

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


    }

    public List<TestBean> parseJsonArray(){

        beans = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(jsonarea);
            for (int i = 0; i < jsonArray.length(); i++) {
                TestBean b = new TestBean();
                b.setName(jsonArray.getJSONObject(i).getString("areaName"));
                b.setCode(jsonArray.getJSONObject(i).getString("areaCode"));
                beans.add(b);
            }
            return beans;

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


    }


    public TestBean adParseJson(){



        return new TestBean();
    }





}
