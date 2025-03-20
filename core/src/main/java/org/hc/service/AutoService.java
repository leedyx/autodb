package org.hc.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.hc.dao.DateDao;
import org.hc.model.AllDateTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;

@Service
public class AutoService implements Runnable{

    private final static Logger LOGGER = LoggerFactory.getLogger(AutoService.class);


    @Autowired
    private JPAQueryFactory jpaQueryFactory;


    @Autowired
    private DateDao dateDao;


    public int insert(){

        AllDateTypes allDateTypes = new AllDateTypes();

        LocalDate localDateNow = LocalDate.now();

        allDateTypes.setDateCol(localDateNow);

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        allDateTypes.setDatetime6Col(localDateTimeNow);
        allDateTypes.setDatetimeCol(localDateTimeNow);

        LocalTime localTimeNow = LocalTime.now();
        allDateTypes.setTimeCol(localTimeNow);
        allDateTypes.setTime6Col(localTimeNow);

        Year yearNow = Year.now();
        allDateTypes.setYearCol(yearNow);

        dateDao.save(allDateTypes);

        return 1;

    }





    @Override
    public void run() {
        insert();
        LOGGER.info("AutoService run");
    }
}
