package com.luckyGirls.forYourNutrition.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.luckyGirls.forYourNutrition.domain.Member;

/**
 * @author Yeonwoo Nam
 *
 */
@Mapper
public interface MemberMapper {

  Member getAccountById(String id);

  Member getAccountByIdAndPassword(String id, String password);
  
  void insertMember(Member member);

  void updateMember(Member member);
  
  void deleteMember(String id);

  String findId(String email, String name);
  
  String findPassword(String id, String email);
}