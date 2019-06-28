package br.com.consultemed.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToLocalDate {

	public static LocalDate convertToLocalDate(String dataString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		// convert String to LocalDate
		LocalDate dataAgendamentoFormatter = LocalDate.parse(dataString, formatter);
		
		return dataAgendamentoFormatter;
	}
}
