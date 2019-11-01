package com.bbs.configmap.configuration;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;
import io.micrometer.core.instrument.Tags;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Method;

/**
 * Micrometer registry configuration
 */
@Configuration
@EnableAspectJAutoProxy
public class RegistryConfig {
    @Bean
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> registry.config().commonTags("app.name", "spring app");
    }
    @Bean
    public TimedAspect timedAspect(MeterRegistry registry) {
        return new TimedAspect(registry);
    }


//    @Bean
//    TimedAspect timedAspect(MeterRegistry registry) {
//        return new TimedAspect(registry, pjp -> {
//            Method method = ((MethodSignature) pjp.getSignature()).getMethod();
//            Timed timed = method.getAnnotation(Timed.class);
//            String typeTagValue = Tags.of(timed.extraTags()).stream()
//                    .filter(tag -> tag.getKey().equals("type"))
//                    .findFirst()
//                    .map(Tag::getValue)
//                    .orElse("");
//
//            return Tags.of("class", pjp.getStaticPart().getSignature().getDeclaringTypeName(),
//                    "method", pjp.getStaticPart().getSignature().getName(),
//                    "type", typeTagValue);
//        });
//    }
}