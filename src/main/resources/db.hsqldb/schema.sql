DROP TABLE PRODUCT IF EXISTS ;

CREATE TABLE PRODUCT(
    PRODUCT_ID INTEGER NOT NULL,
    PRODUCT_NAME VARCHAR(255),
    PRICE DECIMAL(12),
    DEAL_PRODUCT_YN CHAR(1) DEFAULT 'N',
    PRIMARY KEY(PRODUCT_ID)
);