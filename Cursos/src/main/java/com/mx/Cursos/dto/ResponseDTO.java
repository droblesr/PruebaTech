package com.mx.Cursos.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class ResponseDTO<T> {
	@NonNull private String success;
	@NonNull private String msg;
	private T response;
	
}
