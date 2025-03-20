package org.hc.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;

@Data
@Entity(name = "all_date_types")
public class AllDateTypes {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_col")
    private LocalDate dateCol;

    @Column(name = "time_col")
    private LocalTime timeCol;

    @Column(name = "time6_col", columnDefinition = "TIME(6)")
    private LocalTime time6Col;

    @Column(name = "datetime_col")
    private LocalDateTime datetimeCol;

    @Column(name = "datetime6_col", columnDefinition = "DATETIME(6)")
    private LocalDateTime datetime6Col;

    @Column(name = "timestamp_col")
    private LocalDateTime timestampCol;

    @Column(name = "timestamp6_col", columnDefinition = "TIMESTAMP(6)")
    private LocalDateTime timestamp6Col;

    @Column(name = "year_col")
    private Year yearCol;
}