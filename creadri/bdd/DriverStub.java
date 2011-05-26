package creadri.bdd;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;

class DriverStub implements Driver {
	private Driver driver;

	protected DriverStub(Driver d) {
		driver = d;
	}

	@Override
	public boolean acceptsURL(String u) throws SQLException {
		return driver.acceptsURL(u);
	}

	@Override
	public Connection connect(String u, Properties p) throws SQLException {
		return driver.connect(u, p);
	}

	@Override
	public int getMajorVersion() {
		return driver.getMajorVersion();
	}

	@Override
	public int getMinorVersion() {
		return driver.getMinorVersion();
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String u, Properties p) throws SQLException {
		return driver.getPropertyInfo(u, p);
	}

	@Override
	public boolean jdbcCompliant() {
		return driver.jdbcCompliant();
	}
}