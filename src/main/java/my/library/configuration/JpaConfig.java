package my.library.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
public class JpaConfig {

//	@Bean
//	public DataSource dataSource() {
//		BasicDataSource ds = new BasicDataSource();
//
//		ds.setDriverClassName("org.h2.Driver");
//		ds.setUrl("jdbc:h2:tcp://localhost/~/library");
//		ds.setUsername("sa");
//		ds.setPassword("");
//		ds.setInitialSize(5);
//		ds.setMaxActive(10);
//
//		return ds;
//	}
//
//	@Bean
//	public JpaVendorAdapter jpaVendorAdapter() {
//		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//
//		adapter.setDatabase(Database.H2);
//		adapter.setShowSql(true);
//		adapter.setGenerateDdl(false);
//		adapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
//
//		return adapter;
//	}
//
//	@Bean
//	public PlatformTransactionManager jpaTransactionManager() {
//		JpaTransactionManager tm = new JpaTransactionManager();
//		tm.setEntityManagerFactory(this.entityManagerFactory().getObject());
//
//		return tm;
//	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//		emf.setDataSource(this.dataSource());
//		emf.setPackagesToScan(
//				new String[] { 
//					"my.library.repository", 
//				});
//		emf.setJpaVendorAdapter(this.jpaVendorAdapter());
//
//		return emf;
//	}
}
