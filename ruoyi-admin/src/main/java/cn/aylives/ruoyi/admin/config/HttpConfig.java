package cn.aylives.ruoyi.admin.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;


@Configuration
@Slf4j
public class HttpConfig {



    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        OkHttp3ClientHttpRequestFactory OkHttp3ClientHttpRequestFactory = new OkHttp3ClientHttpRequestFactory();
        OkHttp3ClientHttpRequestFactory.setReadTimeout(1000 * 10);
        restTemplate.setRequestFactory(OkHttp3ClientHttpRequestFactory);
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        return restTemplate;
    }



}

