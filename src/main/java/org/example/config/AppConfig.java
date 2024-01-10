package org.example.config;


import com.struggle.http.spring.UrlScan;
import org.springframework.stereotype.Component;

@Component
@UrlScan("org.example.mapper")
public class AppConfig {
}
