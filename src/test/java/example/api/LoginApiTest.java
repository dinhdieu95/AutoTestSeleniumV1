package example.api;

import common.RequestAPI;
import dto.LoginDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginApiTest {
    @Test
    public  void check_login(){
        Map<String, Object> request = new HashMap<>();
        LoginDTO loginDTO = new LoginDTO("105C056630","12345678");
        Response response = RequestAPI.post("https://apipub.tcbs.com.vn/authen/v1/login", request, loginDTO);
        Assert.assertEquals( response.getStatusCode() , 400, "Kết quả không khớp");
    }
}
