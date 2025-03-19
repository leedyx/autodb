package org.hc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Entity(name = "all_float_types")
public class AllFloatTypes {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "float_col", precision = 5, scale = 2)
    private Float floatCol;

    @Column(name = "float_no_precision")
    private Float floatNoPrecision;

    @Column(name = "double_col", precision = 10, scale = 4)
    private Double doubleCol;

    @Column(name = "double_no_precision")
    private Double doubleNoPrecision;

    @Column(name = "decimal_col", precision = 15, scale = 6)
    private BigDecimal decimalCol;
}