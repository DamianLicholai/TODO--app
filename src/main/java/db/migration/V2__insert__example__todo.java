//package db.migration;
//
//import org.flywaydb.core.api.migration.BaseJavaMigration;
//import org.flywaydb.core.api.migration.Context;
//import org.flywaydb.core.internal.jdbc.JdbcTemplate;
//import org.springframework.jdbc.datasource.SingleConnectionDataSource;
//
//import java.sql.Connection;
//
//public class V2__insert__example__todo extends BaseJavaMigration {
//
//    @Override
//    public void migrate(Context context) throws Exception {
//        new JdbcTemplate((Connection) new SingleConnectionDataSource(context.getConnection(), true))
//                .execute("INSERT INTO tasks (description, done) Values ('Learn Java migrations', true)");
//    }
//}



//NIe wyszło mi to