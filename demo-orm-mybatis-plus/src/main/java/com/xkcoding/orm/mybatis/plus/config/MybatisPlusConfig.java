package com.xkcoding.orm.mybatis.plus.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>
 * mybatis-plus 配置
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-08 17:29
 */
@Configuration
@MapperScan(basePackages = {"com.xkcoding.orm.mybatis.plus.mapper"})
@EnableTransactionManagement
public class MybatisPlusConfig {
    /**
     * 性能分析拦截器，不建议生产使用，方便查看执行sql
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
    * @Description: 逻辑删除拦截器
    * @Date: 2021/11/19
    **/
    @Bean
    public ISqlInjector sqlInjector(){
        return new LogicSqlInjector();
    }
}
