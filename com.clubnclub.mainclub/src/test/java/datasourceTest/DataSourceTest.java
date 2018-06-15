package datasourceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;

public class DataSourceTest {
	@Resource(name="dataSource")
	DataSource dataSource;

	@Test
	public void testDbcpDataSource() throws Exception{
		assertNotNull(dataSource);
		assertEquals("org.apache.commons.dbcp.BasicDataSource",dataSource.getClass().getName());
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			con = dataSource.getConnection();
			assertNotNull(con);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select 'x' as x from dual");
			while(rs.next()){
				assertEquals("x",rs.getString(1));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
