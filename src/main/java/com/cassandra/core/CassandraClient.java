package com.cassandra.core;

import org.springdata.cassandra.core.CassandraOperations;
import org.springdata.cassandra.cql.core.RingMember;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cassandra.config.SpringCassandraApplicationConfig;

public class CassandraClient {
	static CassandraOperations ops;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringCassandraApplicationConfig.class);
		ops = context.getBean("cassandraTemplate", CassandraOperations.class);
		for (RingMember member : ops.cqlOps().describeRing()) {
			System.out.println(member.toString());
		}
	}
}