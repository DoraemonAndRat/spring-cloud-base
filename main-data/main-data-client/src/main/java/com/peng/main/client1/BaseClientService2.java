package com.peng.main.client1;

import com.peng.common.pojo.ResponseData;
import com.peng.main.api.InterfaceService;
import com.peng.main.api.mapper.model.OauthClientDetails;
import com.peng.main.api.pojo.ResponseCode;
import com.peng.main.api.service.BaseClientRemoteService;
import org.springframework.cloud.netflix.feign.FeignClient;

import java.util.List;

/**
 * Created by fp295 on 2018/4/9.
 */
@FeignClient(name = InterfaceService.SERVICE_NAME2, fallback = BaseClientService2.HystrixClientFallback.class)
public interface BaseClientService2 extends BaseClientRemoteService {

    class HystrixClientFallback implements BaseClientService2 {

        @Override
        public ResponseData<List<OauthClientDetails>> getAllClient() {
            return new ResponseData<>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getMessage());
        }
    }
}
