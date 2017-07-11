package my.library.hibernate;

import java.sql.Connection;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.H2Dialect;
import org.hibernate.engine.jdbc.internal.FormatStyle;
import org.hibernate.engine.jdbc.internal.Formatter;
import org.hibernate.internal.SessionImpl;
import org.hibernate.tool.hbm2ddl.DatabaseMetadata;
import org.hibernate.tool.hbm2ddl.SchemaUpdateScript;

public class CreateTableSqlGenerator {

	public static void main(String[] args) throws Exception {
		Configuration config = HibernateUtil.getConfiguration();
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		}
		catch(HibernateException ex) {
			session = sessionFactory.openSession();
		}
		Connection connection = ((SessionImpl) session).connection();
		
		Dialect dialect = new H2Dialect();
		
		DatabaseMetadata metadata = new DatabaseMetadata(connection, dialect , config);
		
		List<SchemaUpdateScript> scripts = config.generateSchemaUpdateScriptList(dialect, metadata);

		Formatter formatter = FormatStyle.DDL.getFormatter();
		for (SchemaUpdateScript script : scripts) {
			System.err.println(formatter.format(script.getScript()) + ";");
		}
	}
}
