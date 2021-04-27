package com.ac.aclcp.modules.cloud.feign.feign.fallback;

import feign.hystrix.FallbackFactory;
import com.ac.aclcp.modules.cloud.feign.feign.JeecgTestClient;
import org.springframework.stereotype.Component;

/**
 * @author qinfeng
 */
@Component
public class JeecgTestClientFallback implements FallbackFactory<JeecgTestClient> {

    @Override
    public JeecgTestClient create(Throwable throwable) {
        return null;
    }
}
