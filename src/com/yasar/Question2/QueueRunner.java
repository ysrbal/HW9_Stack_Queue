package com.yasar.Question2;

import java.util.*;


public class QueueRunner {
    public static void main(String[] args) {
        pideDagit(musteriEkle(), pideUret());

    }

    public static Queue<String> musteriEkle() {
        Scanner scanner = new Scanner(System.in);
        Queue<String> musteriQueue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Lütfen müþteri adýný giriniz ... : ");
            String name = scanner.nextLine();
            musteriQueue.offer(name);
        }
        return musteriQueue;
    }

    public static int pideUret() {
        int pideSayisi = new Random().nextInt(1, 13);
        System.out.println("Üretilen pide sayýsý .... : " + pideSayisi);
        return pideSayisi;
    }

    public static void pideDagit(Queue<String> stringQueue, int index) {
        while (!stringQueue.isEmpty() && index > 0) {
            String pideAlan = stringQueue.poll();
            index--;
        }
        if (index == 0) {
            System.out.println("Pide kalmadý.");
        }

        if (!stringQueue.isEmpty()) {
            System.out.println("--- Pide almayan Müþteriler ---");
            for (String musteri : stringQueue) {
                System.out.println(musteri);
            }
        } else {
            System.out.println("Herkes pide aldý.");
        }

    }
}
