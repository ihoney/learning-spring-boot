package com.example;

import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hongtao on 16/5/16.
 */
@RestController
public class DeviceDetectionController {

    /*
     * 引入spring-mobile-device依赖之后,spring boot会自动配置:
     *      DeviceResolverHandlerInterceptor
     *      DeviceHandlerMethodArgumentResolver
     *
     * 其中,DeviceResolverHandlerInterceptor会检测User-Agent头域,以判断请求来自桌面、手机、平板的浏览器。
     * 而DeviceHandlerMethodArgumentResolver则提供了Device实例可在controller类内使用。
     */
    @RequestMapping(value = "/detect-device", method = RequestMethod.GET)
    public String detectDevice(Device device) {
        String deviceType = "unknown";
        if (device.isNormal()) {
            deviceType = "normal";
        } else if (device.isMobile()) {
            deviceType = "mobile";
        } else if (device.isTablet()) {
            deviceType = "tablet";
        }

        return "Hello " + deviceType + " browser!";
    }
}
