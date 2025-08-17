package in.careerit.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JavaConfigFile {
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();

		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		datasource.setUsername("scott");
		datasource.setPassword("tiger");
		return datasource;
	}
	/*
	 * @Bean public JdbcTemplate getJdbcTemplate() { JdbcTemplate jdbcTemplate = new
	 * JdbcTemplate(); jdbcTemplate.setDataSource(getDataSource()); return
	 * jdbcTemplate; }
	 */
	

	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		NamedParameterJdbcTemplate namedparametrJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
		//jdbcTemplate.setDataSource(getDataSource());
		return namedparametrJdbcTemplate;
	}

}

