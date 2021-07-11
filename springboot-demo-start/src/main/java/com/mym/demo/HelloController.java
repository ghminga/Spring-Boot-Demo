package com.mym.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot环境最简单案例
 * @author ym.mo 2020-05-26
 */
@Controller
public class HelloController {

    /**
     * 测试方法
     * @deprecated 在浏览器输入localhost:8080/hello即可，注意端口号
     * @return json字符串
     */
    @RequestMapping(value="hello",method = RequestMethod.GET)
    @ResponseBody
    public String getHello(){
        return "hello world";
    }
}
