package com.demo.SpringBootWebServiceRest.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.SpringBootWebServiceRest.beans.Subject;
import com.demo.SpringBootWebServiceRest.dto.SubjectDto;

public class SubjectDtoMapper {

	public static Subject mapTosubuct(SubjectDto s) {

		return new Subject(s.getSid(), s.getsName(), s.getDuration(),
				LocalDate.parse(s.getStdt(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

	public static SubjectDto mapToSubjectDto(Subject sub) {
		if (sub.getStdt() == null) {
			return new SubjectDto(sub.getSid(), sub.getsName(), sub.getDuration(), null);
		}
		return new SubjectDto(sub.getSid(), sub.getsName(), sub.getDuration(),
				sub.getStdt().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
}
