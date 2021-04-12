package com.rofamex.springboot_oop_v1.collections_test;

import java.util.HashMap;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapTest {
	private static final Logger LOG = LoggerFactory.getLogger(MapTest.class);

	public void execute() {
		LOG.info("Map (key=living being, value=legs)");
		LOG.info("Added (horse, 4)");
		LOG.info("Added (spider, 8)");
		LOG.info("Added (dog, 4)");
		LOG.info("Added (human, 2)");

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("horse", 4);
		hashMap.put("spider", 8);
		hashMap.put("dog", 4);
		hashMap.put("human", 2);
		LOG.info("hashMap values {}", hashMap);

		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("horse", 4);
		treeMap.put("spider", 8);
		treeMap.put("dog", 4);
		treeMap.put("human", 2);
		LOG.info("treeMap values {}", treeMap);

	}
}
