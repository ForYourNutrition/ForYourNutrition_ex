package com.luckyGirls.forYourNutrition.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.luckyGirls.forYourNutrition.domain.Address;

/**
 * @author Yeonwoo Nam
 *
 */
public interface AddressDao {
	void insertAddress(Address address) throws DataAccessException; // 배송지 추가
	
	List<Address> getAddressList(int member_id) throws DataAccessException; // 회원의 모든 배송지 조회
	
	Address getAddress(int address_id) throws DataAccessException; // 배송지 정보 조회
	
	void deleteAddress(int address_id) throws DataAccessException; // 배송지 삭제
	
	void updateAddress(Address address) throws DataAccessException; // 배송지 수정
}
