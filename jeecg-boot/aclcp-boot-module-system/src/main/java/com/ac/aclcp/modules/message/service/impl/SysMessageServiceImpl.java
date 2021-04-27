package com.ac.aclcp.modules.message.service.impl;

import com.ac.aclcp.common.system.base.service.impl.JeecgServiceImpl;
import com.ac.aclcp.modules.message.entity.SysMessage;
import com.ac.aclcp.modules.message.mapper.SysMessageMapper;
import com.ac.aclcp.modules.message.service.ISysMessageService;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息
 * @Author: jeecg-boot
 * @Date:  2019-04-09
 * @Version: V1.0
 */
@Service
public class SysMessageServiceImpl extends JeecgServiceImpl<SysMessageMapper, SysMessage> implements ISysMessageService {

}
