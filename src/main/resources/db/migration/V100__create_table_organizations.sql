CREATE TABLE organizations (
    id BINARY(16) PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE,
    label VARCHAR(255) DEFAULT NULL
);