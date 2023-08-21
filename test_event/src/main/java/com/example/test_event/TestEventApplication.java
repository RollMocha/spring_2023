package com.example.test_event;

import com.example.test_event.entity.Event;
import com.example.test_event.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class TestEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEventApplication.class, args)
				.getBean(TestEventApplication.class).execute();
	}

	@Autowired
	EventRepository repository;

	private void execute() {
		//setup();
		showList();
	}

	private void setup() {
		Event event1 = new Event(null, LocalDate.of(2023,8,8),LocalDate.of(2023,8,15),"/img/event_image.jpg","/img/event_image.jpg","내용 2입니다.",true);
		event1 = repository.save(event1);
		System.out.println(event1);
	}

	private void showList() {
		System.out.println(" --- 모든 데이터 취득 개시 --- ");
		Iterable<Event> events = repository.findAll();
		for(Event event : events) {
			System.out.println(event);
		}
		System.out.println(" --- 모든 데이터 취득 개시 --- ");
	}
	private void showOne() {
		System.out.println(" --- 1건 취득 개시 --- ");
		Iterable<Event> events = repository.findById();
		for(Event event : events) {
			System.out.println(event);
		}
		System.out.println(" --- 모든 데이터 취득 개시 --- ");
	}
}
