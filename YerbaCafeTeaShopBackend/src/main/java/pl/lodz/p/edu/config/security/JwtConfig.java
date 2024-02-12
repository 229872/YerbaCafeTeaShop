package pl.lodz.p.edu.config.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.lodz.p.edu.config.database.property.JwtProperties;

@Configuration
public class JwtConfig {

    @Bean(name = "authTokenProperties")
    @ConfigurationProperties("app.security.auth-token")
    public JwtProperties tokenProperties() {
        return new JwtProperties();
    }

    @Bean(name = "refreshTokenProperties")
    @ConfigurationProperties("app.security.refresh-token")
    public JwtProperties refreshTokenProperties() {
        return new JwtProperties();
    }
}
