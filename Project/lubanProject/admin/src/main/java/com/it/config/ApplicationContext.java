package com.it.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.it")
@EnableAspectJAutoProxy
@EnableAsync
public class ApplicationContext {


    //创建数据源
    @Bean("dataSource")
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/shop?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("mayadong");
        dataSource.setInitialSize(3);
        dataSource.setMaxIdle(10);
        dataSource.setMaxWait(1000);//最长等待时间
        return dataSource;
    }

    //管理mybatis的selSessionBean
    @Bean("sqlSessionFactoryBean") //value ：为创建的 bean取别名，默认是方法名首字母小写
    //参数DataSource ：sqlSessionFactoryBean 依赖参数DataSource
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        //mapper配置 "classpath*:mapping/*Mapper.xml"

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {//com/it/dao/mapping/T1DaoMapper.xml
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:com/it/**/*Mapper.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //<property name="mapperLocations" value="classpath*:mappers/*Mapper.xml"></property>
        return sqlSessionFactoryBean;
    }

    //扫描mapper创建dao代理
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.it.dao");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        return mapperScannerConfigurer;
    }

}
