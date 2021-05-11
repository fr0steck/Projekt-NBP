CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START 1 INCREMENT 1;

CREATE TABLE IF NOT EXISTS currency (
    id BIGINT PRIMARY KEY,
    request_type VARCHAR(255),
    request TEXT,
    response TEXT,
    date TIMESTAMP
);