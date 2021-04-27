package com.ac.aclcp.modules.demo.cloud.service;

import com.ac.aclcp.common.api.vo.Result;

public interface JcloudDemoService {
    Result<String> getMessage(String name);
}
