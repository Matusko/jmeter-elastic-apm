package sk.matusko.tutorial.jmeterelasticapm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class RequestResponseLoggingInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void afterCompletion(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
        log.info(request.getMethod() + " => " + request.getRequestURI() + ", status: " + response.getStatus());
    }
}