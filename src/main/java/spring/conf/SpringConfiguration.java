package spring.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class SpringConfiguration {
	
	@Bean(name="dataSource")
	public BasicDataSource getBasicDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		basicDataSource.setUsername("java");
		basicDataSource.setPassword("itbank");
		basicDataSource.setMaxTotal(20);
		basicDataSource.setMaxIdle(3);
		
		return basicDataSource;
	}
	
	@Bean(name="sqlSessionFactory")
	public SqlSessionFactory getSqlSessionFactoryBean() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = 
							new SqlSessionFactoryBean();
		
		PathMatchingResourcePatternResolver pmrpr = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setDataSource(getBasicDataSource());
		sqlSessionFactoryBean.setConfigLocation(pmrpr.getResource("/spring/mybatis-config.xml"));
		sqlSessionFactoryBean.setMapperLocations(pmrpr.getResources("*/dao/*Mapper.xml"));
		
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean(name="sqlSession")
	public SqlSessionTemplate getSqlSessionTemplate() throws Exception {
		return new SqlSessionTemplate(getSqlSessionFactoryBean());
	}
	
	@Bean(name="transactionManager") //commit과 rollback을 해주는 애..
	public DataSourceTransactionManager getDataSourceTransactionManager() {
		DataSourceTransactionManager dataSourceTransactionManager = 
				new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(getBasicDataSource());
		return dataSourceTransactionManager;
	}
	
}
