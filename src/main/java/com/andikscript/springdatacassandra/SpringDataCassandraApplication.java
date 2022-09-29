package com.andikscript.springdatacassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories
public class SpringDataCassandraApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataCassandraApplication.class, args);
    }

}
