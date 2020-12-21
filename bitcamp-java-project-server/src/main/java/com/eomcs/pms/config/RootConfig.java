package com.eomcs.pms.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

// Spring webmvc framework에서 ContextLoaderListener가 사용할 Java Config이다.
// 웹 컨포넌트가 공유할 객체를 선언
// 예) DAO, Service 등

@ComponentScan(
    value="com.eomcs.pms",
    excludeFilters = {
        @Filter(type = FilterType.REGEX, pattern = "com.eomcs.pms.web.*")
    })
public class RootConfig {

}
