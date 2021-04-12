package com.rofamex.springboot_oop_v1.collections_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListTest {
	private static final Logger LOG = LoggerFactory.getLogger(ListTest.class);

	public void execute() {
		int count[] = { 21, 23, 43, 53, 22, 65 };
		LOG.info("Initial array values: 21, 23, 43, 53, 22, 65");

		List<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			arrayList.add(count[i]);
		}
		LOG.info("list values: {}", arrayList);

		List<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < 6; i++) {
			linkedList.add(count[i]);
		}
		LOG.info("queue values: {}", linkedList);
		
	}
}
