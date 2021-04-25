package com.rcb.saml.ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() throws Exception {
        return "Hello World!";
    }

    /*
    @GetMapping("/matrices")
    @ResponseBody
    public String testMatrices() throws Exception {

        HttpClient h = new DefaultHttpClient();
        HttpResponse httpResponse = h.execute(new HttpGet("http://127.0.0.1:5000/matrices"));//Pointing to (to be private) REST API server
        String getResponse = EntityUtils.toString(httpResponse.getEntity());

        return getResponse;

    }
    */
}
