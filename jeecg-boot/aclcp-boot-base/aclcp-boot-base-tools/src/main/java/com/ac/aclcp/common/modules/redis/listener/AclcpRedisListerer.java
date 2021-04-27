package com.ac.aclcp.common.modules.redis.listener;

import com.ac.aclcp.common.base.BaseMap;

/**
 * 自定义消息监听
 */
public interface AclcpRedisListerer {

    void onMessage(BaseMap message);

}
