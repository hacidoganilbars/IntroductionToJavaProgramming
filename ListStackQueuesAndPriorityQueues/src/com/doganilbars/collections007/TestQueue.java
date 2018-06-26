package com.doganilbars.collections007;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("Adana");
		queue.offer("Osmaniye");
		queue.offer("Balýkesir");
		queue.offer("Ankara");
		queue.offer("Ýstanbul");
		queue.offer("Mersin");
		queue.offer("Sivas");

		while (queue.size() > 0) {
			System.out.print(queue.remove() + " ");
		}
	}
}
