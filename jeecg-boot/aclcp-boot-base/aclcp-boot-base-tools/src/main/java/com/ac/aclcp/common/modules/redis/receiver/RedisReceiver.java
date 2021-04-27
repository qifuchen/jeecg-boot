package com.ac.aclcp.common.modules.redis.receiver;


import cn.hutool.core.util.ObjectUtil;
import com.ac.aclcp.common.constant.GlobalConstants;
import com.ac.aclcp.common.modules.redis.listener.AclcpRedisListerer;
import lombok.Data;
import com.ac.aclcp.common.base.BaseMap;
import com.ac.aclcp.common.util.SpringContextHolder;
import org.springframework.stereotype.Component;

/**
 * @author zyf
 */
@Component
@Data
public class RedisReceiver {


    /**
     * 接受消息并调用业务逻辑处理器
     *
     * @param params
     */
    public void onMessage(BaseMap params) {
        Object handlerName = params.get(GlobalConstants.HANDLER_NAME);
        AclcpRedisListerer messageListener = SpringContextHolder.getHandler(handlerName.toString(), AclcpRedisListerer.class);
        if (ObjectUtil.isNotEmpty(messageListener)) {
            messageListener.onMessage(params);
        }
    }

}
