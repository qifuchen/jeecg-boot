package com.ac.aclcp.boot.starter.rabbitmq.event;

/**
 * 业务模块消息处理器接口
 */
public interface JeecgBusEventHandler {
    void onMessage(EventObj map);
}
