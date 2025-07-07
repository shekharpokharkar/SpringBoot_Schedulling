package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Test {

	@Scheduled(fixedDelay = 1000, initialDelay = 1000)
	@Async
	public void scheduleTaskEveryFixedDelay() throws InterruptedException {
		System.out.println("Task Excecuted by Thred Fixed Delay" + Thread.currentThread().getName());

		Thread.sleep(2000);
	}

	@Async
	@Scheduled(fixedRate = 1000, initialDelay = 1000)
	public void scheduleTaskEveryFixedRate() throws InterruptedException {
		System.out.println("Task Excecuted by Thred Fixed Rate" + Thread.currentThread().getName());

		Thread.sleep(1000);
	}

	@Async
	@Scheduled(cron = "*/2 * * * * *")
	public void scheduleTaskEveryCronExpression() throws InterruptedException {
		System.out.println("Task Excecuted by Thred Corn Expression" + Thread.currentThread().getName());

		Thread.sleep(1000);
	}
}
