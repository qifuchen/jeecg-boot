package com.ac.aclcp.common.system.api.factory;

import com.ac.aclcp.common.system.api.fallback.SysBaseAPIFallback;
import feign.hystrix.FallbackFactory;
import com.ac.aclcp.common.system.api.ISysBaseAPI;
import org.springframework.stereotype.Component;

@Component
public class SysBaseAPIFallbackFactory implements FallbackFactory<ISysBaseAPI> {

    @Override
    public ISysBaseAPI create(Throwable throwable) {
        SysBaseAPIFallback fallback = new SysBaseAPIFallback();
        fallback.setCause(throwable);
        return fallback;
    }
}