package br.com.redfield.localdatetimeserialize.utils;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;

import java.time.LocalDateTime;

public class LocalDateTimeUtils {

    public static LocalDateTime convertStringToDateTime(String date){

        DateTimeParser[] parsers = {
                DateTimeFormat.forPattern("yyyy-MM-dd HH").getParser(),
                DateTimeFormat.forPattern("yyyyMMdd").getParser(),
                DateTimeFormat.forPattern("yyyyMMddHHmmss").getParser(),
                DateTimeFormat.forPattern("yyyyMMddHHmmssSSS").getParser(),
                DateTimeFormat.forPattern("yyyy-MM-dd").getParser(),
                DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss").getParser(),
                DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SS").getParser()
        };
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .append(null,parsers)
                .toFormatter();
        org.joda.time.LocalDateTime jodaLocalDateTime = formatter.parseLocalDateTime(date);
        return LocalDateTime.of(
                jodaLocalDateTime.getYear(),
                jodaLocalDateTime.getMonthOfYear(),
                jodaLocalDateTime.getDayOfMonth(),
                jodaLocalDateTime.getHourOfDay(),
                jodaLocalDateTime.getMinuteOfHour(),
                jodaLocalDateTime.getSecondOfMinute(),
                jodaLocalDateTime.getMillisOfSecond()
        );
    }
}
