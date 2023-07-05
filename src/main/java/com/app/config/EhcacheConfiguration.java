package com.app.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
//@EnableCaching
public class EhcacheConfiguration {

    @Bean
    CacheManager cacheManager(){
        return new EhCacheCacheManager(ehCacheManager());
    }

    private net.sf.ehcache.CacheManager ehCacheManager() {
        EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
        factoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        factoryBean.setShared(true);
        return factoryBean.getObject();
    }
    
//    @Configuration
//    public class EhCacheConfiguration {
//
//        @Bean
//        public EhCacheCacheManager ehCacheCacheManager() {
//
//            return new EhCacheCacheManager(ehCacheManagerFactoryBean().getObject());
//        }
//
//
//        @Bean
//        public EhCacheManagerFactoryBean ehCacheManagerFactoryBean() {
//
//            EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
//
//            cacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
//            cacheManagerFactoryBean.setShared(true);
//
//            return cacheManagerFactoryBean;
//        }
//    }
}
