package factory_method_pattern.dbquery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by cuikangyuan on 2017/5/26.
 */
public abstract class QueryRunner {

    public ResultSet run() throws Exception {

        Connection connection = createConnection();
        String sql = createSql();

        return runSql(connection, sql);
    }

    protected abstract String createSql();
    protected abstract Connection createConnection();
    protected abstract ResultSet runSql(Connection connection, String sql) throws SQLException;
}
