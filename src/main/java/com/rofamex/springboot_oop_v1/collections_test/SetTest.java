package com.rofamex.springboot_oop_v1.collections_test;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetTest {
	private static final Logger LOG = LoggerFactory.getLogger(SetTest.class);

	public void execute() {
		int count[] = { 21, 23, 43, 53, 22, 65, 21 };
		LOG.info("Initial array values: 21, 23, 43, 53, 22, 65, 21");

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < 6; i++) {
			set.add(count[i]);
		}

		LOG.info("set values: {}", set);

		TreeSet<Integer> treeSet = new TreeSet<Integer>(set);
		LOG.info("treeSet values: {}", treeSet);

	}

}
