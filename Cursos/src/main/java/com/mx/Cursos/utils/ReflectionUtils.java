package com.mx.Cursos.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReflectionUtils {
	private static Logger LOG = LogManager.getLogger(ReflectionUtils.class);
	
	public static Object copyObjectPerToObjectPer(final Object entity) {
		Object dto = new Object();
		Object objecto;
		
		objecto = copyProperties(entity, dto.getClass());
				
		return objecto;
	}
	
	private static Object copyProperties(final Object origen, Class<?> destClass) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		return objectMapper.convertValue(origen, destClass);
	}
}
