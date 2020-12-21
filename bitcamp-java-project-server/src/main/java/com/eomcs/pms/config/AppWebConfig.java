package com.eomcs.pms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.util.UrlPathHelper;


@ComponentScan("com.eomcs.pms.web")
@EnableWebMvc
public class AppWebConfig implements WebMvcConfigurer {

  @Bean
  public ViewResolver viewResolver() {
    InternalResourceViewResolver vr = new InternalResourceViewResolver(//
        "/WEB-INF/jsp/", // prefix
        ".jsp" // suffix
    );
    return vr;
  }

  // @MatrixVariable 애노테이션 처리를 활성화시킨다.
  @Override
  public void configurePathMatch(PathMatchConfigurer configurer) {
    UrlPathHelper helper = new UrlPathHelper();
    helper.setRemoveSemicolonContent(false);
    configurer.setUrlPathHelper(helper);
  }

  // 이 설정을 사용하는 프론트 컨트롤러에 적용할 인터셉터 설정하기
  // @Override
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
	  // 인터셉터를 InterceptorResistry에 등록한다.
  }
}


