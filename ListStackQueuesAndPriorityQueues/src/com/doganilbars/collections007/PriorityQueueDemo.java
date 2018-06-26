package com.doganilbars.collections007;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.offer("Adana");
		queue1.offer("Ankara");
		queue1.offer("Osmaniye");
		queue1.offer("Balýkesir");
		queue1.offer("Manisa");
		queue1.offer("Ýstanbul");

		System.out.println("Priority queue using comparable ");
		while (queue1.size() > 0) {
			System.out.print(queue1.remove() + " ");
		}

		PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
		queue2.offer("Adana");
		queue2.offer("Ankara");
		queue2.offer("Osmaniye");
		queue2.offer("Balýkesir");
		queue2.offer("Manisa");
		queue2.offer("Ýstanbul");
		System.out.println("\n\nPriority queue using Comparator");
		while (queue2.size() > 0) {
			System.out.print(queue2.remove() + " ");
		}
	}
}
