package org.hc.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigInteger;

@Data
@Entity(name="all_integer_types")
public class AllIntegerTypes {
    @Id
    @GeneratedValue
    private Long id;

    // 有符号类型
    @Column(name = "tinyint_col")
    private Byte tinyintCol;

    @Column(name = "smallint_col")
    private Short smallintCol;

    @Column(name = "mediumint_col")
    private Integer mediumintCol;

    @Column(name = "int_col")
    private Integer intCol;

    @Column(name = "bigint_col")
    private Long bigintCol;

    // 无符号类型
    @Column(name = "tinyint_unsigned_col", columnDefinition = "TINYINT UNSIGNED")
    private Integer tinyintUnsignedCol;

    @Column(name = "smallint_unsigned_col", columnDefinition = "SMALLINT UNSIGNED")
    private Integer smallintUnsignedCol;

    @Column(name = "mediumint_unsigned_col", columnDefinition = "MEDIUMINT UNSIGNED")
    private Integer mediumintUnsignedCol;

    @Column(name = "int_unsigned_col", columnDefinition = "INT UNSIGNED")
    private Long intUnsignedCol;

    @Column(name = "bigint_unsigned_col", columnDefinition = "BIGINT UNSIGNED")
    private BigInteger bigintUnsignedCol;

}
