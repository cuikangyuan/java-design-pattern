package factory_method_pattern.dbquery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by cuikangyuan on 2017/5/26.
 */
public class OracleQueryRunner extends QueryRunner{
    @Override
    protected String createSql() {
        return "select * from test";
    }

    @Override
    protected Connection createConnection() {
        return null;
    }

    @Override
    protected ResultSet runSql(Connection connection, String sql) throws SQLException {

        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }
}
