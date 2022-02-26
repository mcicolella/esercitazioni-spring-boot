package net.emmecilab.interceptors.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import net.emmecilab.interceptors.demo.component.InterceptorExample;

@Configuration
public class InterceptorExampleConfig implements WebMvcConfigurer {

	@Autowired
	InterceptorExample interceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
		//registry.addInterceptor(interceptor).addPathPatterns("/demo");
	}

}
