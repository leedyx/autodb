CREATE TABLE all_integer_types (
    -- 有符号类型
    tinyint_col TINYINT,
    smallint_col SMALLINT,
    mediumint_col MEDIUMINT,
    int_col INT,
    bigint_col BIGINT,

    -- 无符号类型
    tinyint_unsigned_col TINYINT UNSIGNED,
    smallint_unsigned_col SMALLINT UNSIGNED,
    mediumint_unsigned_col MEDIUMINT UNSIGNED,
    int_unsigned_col INT UNSIGNED,
    bigint_unsigned_col BIGINT UNSIGNED
);

CREATE TABLE all_string_types (
    -- 定长字符串
    char_col CHAR(10),
    binary_col BINARY(20),

    -- 变长字符串
    varchar_col VARCHAR(255),
    varbinary_col VARBINARY(500),

    -- 文本类型
    tinytext_col TINYTEXT,
    text_col TEXT,
    mediumtext_col MEDIUMTEXT,
    longtext_col LONGTEXT,

    -- 二进制大对象
    tinyblob_col TINYBLOB,
    blob_col BLOB,
    mediumblob_col MEDIUMBLOB,
    longblob_col LONGBLOB,

    -- 特殊集合类型
    enum_col ENUM('small', 'medium', 'large'),
    set_col SET('a', 'b', 'c')
);

CREATE TABLE all_date_types (
    -- 日期类型
    date_col DATE,

    -- 时间类型
    time_col TIME,
    time6_col TIME(6),  -- 带微秒精度

    -- 日期时间组合
    datetime_col DATETIME,
    datetime6_col DATETIME(6),  -- 带微秒精度

    -- 时间戳（自动转换时区）
    timestamp_col TIMESTAMP,
    timestamp6_col TIMESTAMP(6),  -- 带微秒精度

    -- 年份类型
    year_col YEAR
);

CREATE TABLE all_float_types (
    -- 单精度浮点数
    float_col FLOAT(5,2),     -- 总位数5，小数位2
    float_no_precision FLOAT, -- 不指定精度

    -- 双精度浮点数
    double_col DOUBLE(10,4),  -- 总位数10，小数位4
    double_no_precision DOUBLE,

    -- 精确小数类型
    decimal_col DECIMAL(15,6) -- 精确存储15位数字（其中6位小数）
);