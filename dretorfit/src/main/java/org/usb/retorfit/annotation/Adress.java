package org.usb.retorfit.annotation;


import org.usb.retorfit.config.UsbConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description : 地址
 * <p/>
 * Created : TIAN FENG
 * Date : 2018/5/15
 * Email : 27674569@qq.com
 * Version : 1.0
 */
// 运行时注解
@Retention(RetentionPolicy.RUNTIME)
// 可以用在函数和参数中
@Target({ElementType.METHOD, ElementType.PARAMETER})
public @interface Adress {
    int value() default UsbConfig.DEFAULT_NO_VALUE;
    /**
     * 占的字节大小
     */
    int size() default UsbConfig.OTHER_LENGTH;
}
