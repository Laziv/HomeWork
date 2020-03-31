package com.laziv.lesson14.task2;

import java.util.*;

public class Shop {
    private Scanner scanner = new Scanner(System.in);
    private Set<Commodity> commodities = new TreeSet<>();

    public void addCommodity() {
        System.out.println("Введіть назву товару");
        String name = scanner.next();

        System.out.println("Введіть довжину товару");
        double length = scanner.nextDouble();

        System.out.println("Введіть ширину товару");
        double width = scanner.nextDouble();

        System.out.println("Введіть вагу товару");
        double weight = scanner.nextDouble();

        commodities.add(new Commodity(name, length, weight, width));
        System.out.println("Товар " + name + " добавлено");
    }

    public void removeCommodity() {
        if (commodities.isEmpty()) {
            System.out.println("Список товарів пустий");
            return;
        }

        boolean isRemote = false;
        System.out.println("Введіть назву товару");
        String name = scanner.next();

        Iterator<Commodity> iterator = commodities.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name)) {
                iterator.remove();
                isRemote = true;
            }
        }

        if (isRemote) {
            System.out.println("Товар " + name + " видалено");
        } else {
            System.out.println("Товар " + name + " не знайдено");
        }
    }

    public void changeCommodity() {
        if (commodities.isEmpty()) {
            System.out.println("Список товарів пустий");
            return;
        }

        String newName;
        boolean isFound = false;
        System.out.println("Введіть назву товару");
        String name = scanner.next();

        Iterator<Commodity> iterator = commodities.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name)) {
                isFound = true;
                iterator.remove();
            }
        }

        if (isFound) {
            System.out.println("Введіть нову назву товару");
            newName = scanner.next();

            System.out.println("Введіть нову довжину товару");
            double length = scanner.nextDouble();

            System.out.println("Введіть нову ширину товару");
            double width = scanner.nextDouble();

            System.out.println("Введіть нову вагу товару");
            double weight = scanner.nextDouble();

            commodities.add(new Commodity(newName, length, weight, width));
            System.out.println("Товар " + name + " замінено");
        } else {
            System.out.println("Товар " + name + " не знайдено");
        }
    }

    public void sortByName() {
        System.out.println("Відсортовані товари по назві");
        printCommodities(commodities);
    }

    public void sortByLength() {
        System.out.println("Відсортовані товари по довжині");
        Set<Commodity> sortCommodities = new TreeSet<>(new CommodityLengthComparator());
        sortCommodities.addAll(commodities);
        printCommodities(sortCommodities);
    }

    public void sortByWeight() {
        System.out.println("Відсортовані товари по вазі");
        Set<Commodity> sortCommodities = new TreeSet<>(new CommodityWeightComparator());
        sortCommodities.addAll(commodities);
        printCommodities(sortCommodities);
    }

    public void sortByWidth() {
        System.out.println("Відсортовані товари по ширині");
        Set<Commodity> sortCommodities = new TreeSet<>(new CommodityWidthComparator());
        sortCommodities.addAll(commodities);
        printCommodities(sortCommodities);
    }

    public void printCommodity() {
        if (commodities.isEmpty()) {
            System.out.println("Список товарів пустий");
            return;
        }

        boolean isFound = false;
        System.out.println("Введіть назву товару");
        String name = scanner.next();

        for (Commodity commodity : commodities) {
            if (commodity.getName().equalsIgnoreCase(name)) {
                System.out.println(commodity.toString());
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("Товар " + name + " не знайдено");
        }
    }

    private void printCommodities(Set<Commodity> set) {

        for (Commodity commodity : set) {
            System.out.println(commodity.toString());
        }
    }
}
