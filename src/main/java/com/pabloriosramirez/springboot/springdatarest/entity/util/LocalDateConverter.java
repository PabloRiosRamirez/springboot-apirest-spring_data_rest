/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com
**/

package com.pabloriosramirez.springboot.springdatarest.entity.util;

import java.time.LocalDate;
import java.sql.Date;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate entityValue) {
        return entityValue == null ? null : Date.valueOf(entityValue);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date databaseValue) {
        return databaseValue == null ? null : databaseValue.toLocalDate();
    }

}
