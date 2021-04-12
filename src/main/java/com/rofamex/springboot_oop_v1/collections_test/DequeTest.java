package com.rofamex.springboot_oop_v1.collections_test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DequeTest {
	private static final Logger LOG = LoggerFactory.getLogger(DequeTest.class);

	public void execute() {
		int count[] = { 21, 23, 43, 53, 22, 65 };
		LOG.info("Initial array values {}", count);

		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		for (int i = 0; i < 6; i++) {
			arrayDeque.add(count[i]);
		}
		LOG.info("deque values: {}", arrayDeque);

		arrayDeque.offer(15);
		LOG.info("deque.offer(15)");
		LOG.info("deque values: {}", arrayDeque);

		arrayDeque.offerFirst(100);
		LOG.info("deque.offerFirst(100)");
		LOG.info("deque values: {}", arrayDeque);

		arrayDeque.offerLast(200);
		LOG.info("deque.offerFirst(200)");
		LOG.info("deque values: {}", arrayDeque);

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		for (int i = 0; i < 6; i++) {
			priorityQueue.add(count[i]);
		}
		LOG.info("priorityQueue values: {}", priorityQueue);
	}
}
