package com.itlinyi.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author 林一
 * @version 1.0
 * <p>
 * 业务层配置类service aop tx
 * <p>
 * service
 * 2.开启aop注解的支持aspect : @Before @After @AfterReturning @AfterThrowing @Around @Aspect@ Order
 * 3.tx声明式事务管理：1.对应的事务管理器实现  2.开启事务注解支持 @Transactional
 */
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan("com.itlinyi.service")
public class ServiceJavaConfig {

    @Bean
    public TransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

}
