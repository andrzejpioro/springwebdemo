//package pl.pioro.tutorial.piorodemo;
//
//import java.util.logging.Logger;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//
//@SpringBootTest
//class JUnitTestInsideDockerComposeTests {
//
//	private static final String DB_USERNAME = "root";
//	private static final String DB_PASSWORD = "carlsberg";
//	private static final String DB_DATABASE_NAME = "cb_sap_importer";
//	private static final String DB_CONTAINER_LINK = "db";
//	private static final String DB_CONTAINER_PORT = "3306";
//	
//	
//	@Test
//	void test01() throws Exception {
//		System.out.println("#### STARTING Test: Test-01");
//		JdbcTemplate template1 = new JdbcTemplate(getDataSource());
//		int dbResult = template1.queryForObject("SELECT 1", Integer.class);
//		Logger.getLogger(this.getClass().getName()).info("SQL: SELECT 1 - returned: " + dbResult);
//		System.out.println("#### DB RESULT for SQL - SELECT 1: "+ dbResult);
//        assertEquals(dbResult,1);
//	}
//	
//	
//    private DriverManagerDataSource getDataSource() {
//	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	        dataSource.setUrl("jdbc:mysql://"+DB_CONTAINER_LINK+":"+DB_CONTAINER_PORT+"/"+DB_DATABASE_NAME);
//	        dataSource.setUsername(DB_USERNAME);
//	        dataSource.setPassword(DB_PASSWORD);
//	        return dataSource;
//	}
//		
//}