package com.ac.aclcp.handler;

import lombok.extern.slf4j.Slf4j;
import com.ac.aclcp.common.base.BaseMap;
import com.ac.aclcp.common.modules.redis.listener.JeecgRedisListerer;
import com.ac.aclcp.loader.DynamicRouteLoader;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 路由刷新监听
 */
@Slf4j
@Component
public class LoderRouderHandler implements JeecgRedisListerer {

    @Resource
    private DynamicRouteLoader dynamicRouteLoader;


    @Override
    public void onMessage(BaseMap message) {
        dynamicRouteLoader.refresh();
    }

}