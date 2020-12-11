-- Создание таблицы PURCHASE
CREATE TABLE IF NOT EXISTS PURCHASE(
    id          INTEGER PRIMARY KEY,
    msisdn      INTEGER NOT NULL,
    act         TEXT,
    timestmp    INTEGER NOT NULL
);

-- Создание таблицы SUBSCRIPTION
CREATE TABLE IF NOT EXISTS SUBSCRIPTION(
    id          INTEGER PRIMARY KEY,
    msisdn      INTEGER NOT NULL,
    act         TEXT,
    timestmp    INTEGER NOT NULL
);