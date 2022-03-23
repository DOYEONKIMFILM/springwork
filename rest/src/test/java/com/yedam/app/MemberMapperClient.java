package com.yedam.app;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.member.mapper.MemberMapper;
import com.yedam.app.member.service.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/config/*-context.xml")
public class MemberMapperClient {
	
	@Autowired MemberMapper mapper;
	@Test
	public void listTest() {
		List<MemberVO> list = mapper.memberSelectList();
		System.out.println(list);
	}
	
	public void seletTest() {
		MemberVO vo = new MemberVO();
		vo.setId("test0322");
		vo.setPassword("1234");
		vo = mapper.memberSelect(vo);
		System.out.println(vo);
		assertEquals(vo.getId(), "test0322");
	}
	
	@Test
	public void insertTest() {
		MemberVO vo = new MemberVO();
		vo.setId("test3322");
		vo.setName("testName2");
		vo.setPassword("1234");
		vo.setTel("01066667878");
		vo.setAddress("대구남일동태왕아너스빌");
		vo.setAuthor("USER");
		int r = mapper.memberInsert(vo);
		assertEquals(r, 1);
	}

}
