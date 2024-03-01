package com.yasar.Question3;

import java.util.PriorityQueue;


public class PriorityQueueRunner {
    public static void main(String[] args) {
        PriorityQueue<Musteri> musteriler = new PriorityQueue<>();
        musteriler.offer(new Musteri(101,"Ya�ar Bal", true));
        musteriler.offer(new Musteri(102,"K�bra Bal", false));
        musteriler.offer(new Musteri(103,"Toprak Bal", false));
        musteriler.offer(new Musteri(104,"Deniz Baran", true));
        musteriler.offer(new Musteri(105,"Yi�it Baran", false));
        musteriler.offer(new Musteri(106,"Onur Co�kun", true));
        musteriler.offer(new Musteri(107,"Pelin Ild�rka�", true));
        musteriler.offer(new Musteri(108,"�nder Eren", false));
        musteriler.offer(new Musteri(109,"Onur Do�an", true));

        while (!musteriler.isEmpty()){
            System.out.println(musteriler.poll());
        }
    }
}
