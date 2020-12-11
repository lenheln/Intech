-- Создание таблицы message
CREATE TABLE IF NOT EXISTS message(
    id          INTEGER PRIMARY KEY,
    msisdn      INTEGER NOT NULL,
    act         TEXT,
    timestmp    INTEGER NOT NULL
);
-- Создание таблицы PURCHASE
CREATE TABLE IF NOT EXISTS PURCHASE(
    id          SERIAL  PRIMARY KEY,
    id_purchase INTEGER REFERENCES message (id)
);

-- Создание таблицы SUBSCRIPTION
CREATE TABLE IF NOT EXISTS SUBSCRIPTION(
    id              SERIAL  PRIMARY KEY,
    id_subscription INTEGER REFERENCES message (id)
);