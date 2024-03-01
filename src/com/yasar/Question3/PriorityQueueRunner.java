package com.yasar.Question3;

import java.util.PriorityQueue;


public class PriorityQueueRunner {
    public static void main(String[] args) {
        PriorityQueue<Musteri> musteriler = new PriorityQueue<>();
        musteriler.offer(new Musteri(101,"Yaþar Bal", true));
        musteriler.offer(new Musteri(102,"Kübra Bal", false));
        musteriler.offer(new Musteri(103,"Toprak Bal", false));
        musteriler.offer(new Musteri(104,"Deniz Baran", true));
        musteriler.offer(new Musteri(105,"Yiðit Baran", false));
        musteriler.offer(new Musteri(106,"Onur Coþkun", true));
        musteriler.offer(new Musteri(107,"Pelin Ildýrkaþ", true));
        musteriler.offer(new Musteri(108,"Önder Eren", false));
        musteriler.offer(new Musteri(109,"Onur Doðan", true));

        while (!musteriler.isEmpty()){
            System.out.println(musteriler.poll());
        }
    }
}
