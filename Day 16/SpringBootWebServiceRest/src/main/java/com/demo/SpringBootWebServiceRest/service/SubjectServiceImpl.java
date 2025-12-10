package com.demo.SpringBootWebServiceRest.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.demo.SpringBootRestWebservice.mapper.ProductDtoMapper;
import com.demo.SpringBootWebServiceRest.beans.Subject;
import com.demo.SpringBootWebServiceRest.dao.SubjectDao;
import com.demo.SpringBootWebServiceRest.dto.SubjectDto;
import com.demo.SpringBootWebServiceRest.mapper.SubjectDtoMapper;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	SubjectDao sdao;

	@Override
	public List<SubjectDto> findAllSubject() {
		List<Subject> slist = sdao.findAll();
		for (Subject s : slist) {
			System.out.println(s);
		}
		List<SubjectDto> sdto = slist.stream().map(sub -> SubjectDtoMapper.mapToSubjectDto(sub))
				.collect(Collectors.toList()); // STREAM API
		return sdto;
	}

	@Override
	public SubjectDto getBySubId(int sid) {

		Optional<Subject> s = sdao.findById(sid);
		if (s.isPresent()) {
			Subject sub = s.get();
			return SubjectDtoMapper.mapToSubjectDto(sub);
		}

		return null;
	}

	@Override
	public void addNewSubject(SubjectDto sdto) {

		Subject s = SubjectDtoMapper.mapTosubuct(sdto);
		sdao.save(s);

	}

	@Override
	public void deleteSubject(int sid) {

		Optional<Subject> s = sdao.findById(sid);
		if (s.isPresent()) {
			Subject sub = s.get();
			SubjectDtoMapper.mapToSubjectDto(sub);
			sdao.delete(sub);
		}

	}

	@Override
	public void modifySubject(SubjectDto sdto ) {
		Subject s = SubjectDtoMapper.mapTosubuct(sdto);
		
			sdao.saveAndFlush(s);
	}

}
