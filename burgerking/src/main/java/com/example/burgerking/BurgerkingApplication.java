package com.example.burgerking;

import com.example.burgerking.entity.Event;
import com.example.burgerking.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
public class BurgerkingApplication {
	public static void main(String[] args) {
		SpringApplication.run(BurgerkingApplication.class, args).getBean(BurgerkingApplication.class).execute();
	}
	/*
	@Autowired
	BurgerkingService service;
	*/

	@Autowired
	EventRepository repository;

	LocalDate open_date = LocalDate.of(2023,8,01);
	LocalDate close_date = LocalDate.of(2023,8,07);
	private void execute() {
		gettest();
		//setup();
		//showList();
		//showOne();
		//updateLogin();
		//deleteLogin();
		//doLogin();
	}
	private void gettest(){
		System.out.println("시작 날짜:" + open_date);
		System.out.println("끝 날짜:" + close_date);
	}
	private void setup() {
		System.out.println(" --- 등록 처리 개시 --- ");
		Event event1 = new Event(null, "/img/event_burger_1", "/img/event_burger_1",open_date, close_date,"내용",true);
		event1 =repository.save(event1);
		System.out.println("등록한 퀴즈는" + event1 + "입니다.");
		List<Event> eventList = new ArrayList<>();
		Collections.addAll(eventList, event1);
		System.out.println(" --- 등록 처리 완료 --- ");
	}

//	private void showList(){
//		System.out.println(" --- 모든 데이터 취득 개시 --- ");
//		Iterable<Login> logins = service.selectAll();
//		for(Login login : logins) {
//			System.out.println(login);
//		}
//		System.out.println(" --- 모든 데이터 취득 완료 ---");
//	}
//
//	private void showOne(){
//		System.out.println(" --- 1 건 취득 개시 --- ");
//		Optional<Login> loginOpt = service.selectOneById(1);
//		if(loginOpt.isPresent()) {
//			System.out.println(loginOpt.get());
//		}
//		else{
//			System.out.println("해당 데이터는 존재하지 않습니다.");
//		}
//		System.out.println(" --- 1 건 취득 완료 ---");
//	}
//
//	private void updateLogin(){
//		System.out.println(" --- 번경 처리 개시 --- ");
//		Login login1 = new Login(null, "dog men", "12345", "진돗개", true);
//		service.updateLogin(login1);
//		System.out.println("변경된 데이터는 " + login1 + "입니다.");
//		System.out.println(" --- 번경 처리 완료 --- ");
//	}
//
//	private void deleteLogin(){
//		System.out.println(" --- 삭제 처리 개시 --- ");
//		service.deleteLogin(2);
//		System.out.println(" --- 삭제 처리 완료 --- ");
//	}
}
