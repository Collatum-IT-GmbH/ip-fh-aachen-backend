package com.collatum.ipfhaachen.configuration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import org.bson.UuidRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration(proxyBeanMethods = false)
public class MongoDbConfig extends AbstractMongoClientConfiguration {

    @Value("${spring.data.mongodb.database}")
    private String databaseName;

    @Value("${spring.data.mongodb.uri}")
    private String mongoConnectionUri;

    public String getDatabaseName() {
        return this.databaseName;
    }

    @Bean
    @Override
    public MongoClientSettings mongoClientSettings() {
        MongoClientSettings settings = super.mongoClientSettings();

        return MongoClientSettings.builder(settings)
                .applyConnectionString(new ConnectionString(mongoConnectionUri))
                .uuidRepresentation(UuidRepresentation.STANDARD)
                .build();
    }

}
