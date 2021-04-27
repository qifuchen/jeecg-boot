package com.ac.aclcp.modules.demo.cloud.service.impl;

import com.ac.aclcp.common.api.vo.Result;
import com.ac.aclcp.modules.demo.cloud.service.JcloudDemoService;
import org.springframework.stereotype.Service;

@Service
public class JcloudDemoServiceImpl implements JcloudDemoService {
    @Override
    public Result<String> getMessage(String name) {
        return Result.OK("Hello，" + name);
    }
}
