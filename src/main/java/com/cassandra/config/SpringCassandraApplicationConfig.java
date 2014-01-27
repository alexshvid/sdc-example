package com.cassandra.config;

import org.springdata.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCassandraApplicationConfig extends AbstractCassandraConfiguration {

	public static final String KEYSPACE = "springdata";

	@Override
	protected String keyspace() {
		return KEYSPACE;
	}
}