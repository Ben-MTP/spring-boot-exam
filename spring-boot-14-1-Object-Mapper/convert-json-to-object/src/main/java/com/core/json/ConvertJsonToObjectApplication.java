package com.core.json;

import com.core.json.model.ServiceModel;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Bước 1: Nếu đã có data.json -> thì thực hiện parse
 * Nếu không có thì làm sao -> phải call http thì mới có data.
 *
 * Bước 2: Lấy data đó về -> thực hiện với các thao tác cơ bản.
 *
 * Call url -> lấy thông tin json...
 */
public class ConvertJsonToObjectApplication {
    public static void main(String[] args) {
        ObjectMapper mapper = null;

        try {
            mapper = new ObjectMapper();
            String json = "[{\"name\":\"laptrinhjavaweb academy\", \"description\":\"Cung cấp khóa học java, java web, deploy hosting\"}, {\"name\":\"laptrinhjavaweb software\", \"description\":\"deploy project java web lên hosting\"},{\"name\":\"laptrinhjavaweb shop\", \"description\": \"áo thun lập trình\"}]";
            List<ServiceModel> serviceModelList = Arrays.asList(mapper.readValue(json, ServiceModel[].class));

            for (ServiceModel item : serviceModelList){
                System.out.println(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
