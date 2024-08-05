package com.javateam.SpringJPA2.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.javateam.SpringJPA2.domain.TestVO;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class DAOTest2 {
	
	@Autowired
	TestRepository testRepo;

	// case-1) 4명의 레코드를 삽입(샘플 데이터 입력)
	@Transactional
	@Rollback(false)
	@Test
	void testInsert() {
		
		TestVO testVO;
		List<TestVO> list = new ArrayList<>();
		testVO = TestVO.builder()
		               .name("오상욱")
		               .address("대전")
		               .age(27)
		               .build();
		list.add(testVO);
		
		testVO = TestVO.builder()
	               .name("구본길")
	               .address("서울")
	               .age(35)
	               .build();
		list.add(testVO);
		
		testVO = TestVO.builder()
	               .name("박상원")
	               .address("대전")
	               .age(23)
	               .build();
		list.add(testVO);
		
		testVO = TestVO.builder()
	               .name("도경동")
	               .address("문경")
	               .age(24)
	               .build();
		list.add(testVO);
		
		List<TestVO> resultList 
			= (List<TestVO>) testRepo.saveAll(list);
		
		assertEquals(4, resultList.size());
	}

}