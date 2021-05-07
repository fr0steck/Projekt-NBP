CREATE SEQUENCE hibernate_sequence START 1 INCREMENT 1;

CREATE TABLE currency (
    id BIGINT PRIMARY KEY,
    request_type VARCHAR(255),
    NBPResponse TEXT,
    APIResponse TEXT
);