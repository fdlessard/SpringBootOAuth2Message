package io.fdlessard.codebites.oauth2.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;

@Slf4j
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GlobalSecurityConfiguration extends GlobalMethodSecurityConfiguration {
    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        log.info("GlobalSecurityConfiguration.createExpressionHandler()");
        return new OAuth2MethodSecurityExpressionHandler();
    }
}
