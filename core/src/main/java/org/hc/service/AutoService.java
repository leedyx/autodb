package org.hc.service;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.hc.dao.DateDao;
import org.hc.dao.FloatDao;
import org.hc.dao.IntegerDao;
import org.hc.dao.StringDao;
import org.hc.model.AllDateTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Service
public class AutoService implements Runnable{

    private final static Logger LOGGER = LoggerFactory.getLogger(AutoService.class);

    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @Autowired
    private DateDao dateDao;

    @Autowired
    private FloatDao floatDao;

    @Autowired
    private IntegerDao integerDao;

    @Autowired
    private StringDao stringDao;





    public int insertDate(){

        AllDateTypes allDateTypes = new AllDateTypes();

        LocalDate localDateNow = LocalDate.now();

        allDateTypes.setDateCol(localDateNow);

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        allDateTypes.setDatetime6Col(localDateTimeNow);
        allDateTypes.setDatetimeCol(localDateTimeNow);

        allDateTypes.setTimestamp6Col(localDateTimeNow);
        allDateTypes.setTimestampCol(localDateTimeNow);


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

        LOGGER.info("AutoService run");

        for (;;){


            try{

                insertDate();

            }catch (Exception e){
                LOGGER.error("AutoService run error",e);
            }


            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (Exception ignored){

            }

        }

    }
}
