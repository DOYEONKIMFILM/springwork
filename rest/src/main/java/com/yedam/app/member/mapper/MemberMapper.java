package com.yedam.app.member.mapper;

import java.util.List;

import com.yedam.app.member.service.MemberVO;


public interface MemberMapper {
	//전체조회
	List<MemberVO> memberSelectList();
	
	//단건조회
	MemberVO memberSelect(MemberVO vo);
	
	//추가
	int memberInsert(MemberVO vo);
	
	//수정
	int memberUpdate(MemberVO vo);
	
	//삭제
	int memberDelete(MemberVO vo);

}
