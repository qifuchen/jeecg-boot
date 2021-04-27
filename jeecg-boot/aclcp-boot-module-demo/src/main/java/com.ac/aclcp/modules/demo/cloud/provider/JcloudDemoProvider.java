package com.ac.aclcp.modules.demo.cloud.provider;

import com.ac.aclcp.common.api.vo.Result;
import com.ac.aclcp.modules.demo.cloud.service.JcloudDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * feign服务端接口
 */
@RestController
@RequestMapping("/test")
public class JcloudDemoProvider {

    @Resource
    private JcloudDemoService jcloudDemoService;

    @GetMapping("/getMessage")
    public Result<String> getMessage(@RequestParam String name) {
        return jcloudDemoService.getMessage(name);
    }

}
