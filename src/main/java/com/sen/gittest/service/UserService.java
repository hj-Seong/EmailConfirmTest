package com.sen.gittest.service;

import org.springframework.stereotype.Service;

import com.sen.gittest.domin.user.User;
import com.sen.gittest.domin.user.UserRepository;
import com.sen.gittest.web.dto.JoinReqDto;
import com.sen.gittest.web.dto.LoginReqDto;
import com.sen.gittest.web.dto.EmailCheckReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	private final UserRepository userRepository;

	public void 회원가입(JoinReqDto dto) {
		userRepository.save(dto.toEntity());

	}
	
	public User 로그인(LoginReqDto dto) {
		User userEntity = userRepository.mLogin(dto.getUsername(), dto.getPassword());
		return userEntity;
	}
	
	public User 이메일인증확인(EmailCheckReqDto dto) {
		User userEntity = userRepository.mCheck(dto.getUsername(), dto.getEmailConfirm());
		return userEntity;
	}
	
	public void 이메일인증업데이트(EmailCheckReqDto dto) {
		userRepository.mUpdate(dto.getUsername());	
	}
}
