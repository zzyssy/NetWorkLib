package com.llj.netstatuslibrary.annotation;

import com.llj.netstatuslibrary.NetType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NetWork {
     NetType netType() default NetType.AUTO;
}
