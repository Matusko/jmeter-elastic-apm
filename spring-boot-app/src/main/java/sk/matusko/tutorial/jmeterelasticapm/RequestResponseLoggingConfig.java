package sk.matusko.tutorial.jmeterelasticapm;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class RequestResponseLoggingConfig implements WebMvcConfigurer {

    private RequestResponseLoggingInterceptor requestResponseLoggingInterceptor;

    public RequestResponseLoggingConfig(RequestResponseLoggingInterceptor requestResponseLoggingInterceptor) {
        this.requestResponseLoggingInterceptor = requestResponseLoggingInterceptor;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestResponseLoggingInterceptor)
                .addPathPatterns("/**");
    }
}