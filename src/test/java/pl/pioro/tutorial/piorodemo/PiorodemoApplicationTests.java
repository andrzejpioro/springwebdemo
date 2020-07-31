//package pl.pioro.tutorial.piorodemo;
//
//import java.util.logging.Logger;
//
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.testcontainers.containers.MySQLContainer;
//
//@SpringBootTest
//class PiorodemoApplicationTests {
//
//	private static final String DB_USERNAME = "carlsberg";
//	private static final String DB_PASSWORD = "c@rlsberg";
//	
//	private static final MySQLContainer MY_SQL_CONTAINER = new MySQLContainer("mysql:8").
//			withDatabaseName("cb_sap_importer").
//			withUsername(DB_USERNAME).withPassword(DB_PASSWORD);
//	
//	static {
//		MY_SQL_CONTAINER.start();
//	}
//	
//	@Test
//	void contextLoads() {
//		try {
//			Logger.getLogger(this.getClass().getName()).info("Docker container name: "+ MY_SQL_CONTAINER.getContainerInfo().getName());
////			Thread.sleep(1000*60*30);
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	
//    @RepeatedTest(100)
//	void test() {
//    	Thread t = new Thread(){
//    		public void run() {
//    			JdbcTemplate template1 = new JdbcTemplate(getDataSource());
//    			Logger.getLogger(this.getClass().getName()).info("SQL: SELECT 1 - returned: " + template1.queryForObject("SELECT 1", Integer.class));
//    		}
//    	};
//    	t.start();
//	}
//	
//	
//	
//	
//	
//    private DriverManagerDataSource getDataSource() {
//	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	        dataSource.setUrl(MY_SQL_CONTAINER.getJdbcUrl());
//	        dataSource.setUsername(DB_USERNAME);
//	        dataSource.setPassword(DB_PASSWORD);
//	        System.out.println("JDBC URL: "+MY_SQL_CONTAINER.getJdbcUrl());
//	        return dataSource;
//	}
//		
//		
//        
//	
//	
//}
//
//
