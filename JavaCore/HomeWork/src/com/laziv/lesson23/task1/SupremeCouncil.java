package com.laziv.lesson23.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class SupremeCouncil {
    private List<Faction> listOfFactions = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public void addFaction() {
        System.out.println("Введіть ім'я фракції");
        String name = scanner.next();

        listOfFactions.add(new Faction(name));
        System.out.println("Фракцію " + name + " додано");
    }

    public void removeFaction() {
        if (isNotEmpty()) {
            System.out.println("Введіть ім'я фракції");
            String name = scanner.next();
            Faction faction = getFaction(name);

            if (faction != null) {
                listOfFactions.remove(faction);
                System.out.println("Фракцію " + name + " видалено");
            }
        }
    }

    public void clearFaction() {
        if (isNotEmpty()) {
            System.out.println("Введіть ім'я фракції");
            String name = scanner.next();
            Faction faction = getFaction(name);

            if (faction != null) {
                faction.removeAllDeputies();
                System.out.println("Фракцію " + name + " очищено від депутатів");
            }
        }
    }

    public void printAllFactions() {
        if (isNotEmpty()) {
            listOfFactions.forEach(x -> {
                System.out.println("Фракція " + x.getName());
                System.out.println("Список депутатів фракції:");
                x.printAllDeputies();
                System.out.println("-------------------------");
            });
        }
    }

    public void printFaction() {
        if (isNotEmpty()) {
            System.out.println("Введіть ім'я фракції");
            String name = scanner.next();
            Faction faction = getFaction(name);

            if (faction != null) {
                System.out.println("Фракця " + name);
                System.out.println("Список депутатів фракції:");
                faction.printAllDeputies();
            }
        }
    }

    public void addDeputyForFaction() {
        if (isNotEmpty()) {
            System.out.println("Введіть ім'я фракції");
            String name = scanner.next();
            Faction faction = getFaction(name);

            if (faction != null) {
                faction.addDeputy();
            }
        }
    }

    public void removeDeputyForFaction() {
        if (isNotEmpty()) {
            System.out.println("Введіть ім'я фракції");
            String name = scanner.next();
            Faction faction = getFaction(name);

            if (faction != null) {
                faction.removeDeputy();
            }
        }
    }

    public void printBribeTakersForFaction() {
        if (isNotEmpty()) {
            System.out.println("Введіть ім'я фракції");
            String name = scanner.next();
            Faction faction = getFaction(name);

            if (faction != null) {
                faction.printBribeTakers();
            }
        }
    }

    public void printBiggestBribeTakerForFaction() {
        if (isNotEmpty()) {
            System.out.println("Введіть ім'я фракції");
            String name = scanner.next();
            Faction faction = getFaction(name);

            if (faction != null) {
                faction.printBiggestBribeTaker();
            }
        }
    }

    private boolean isNotEmpty() {
        if (!listOfFactions.isEmpty()) {
            return true;
        } else {
            System.out.println("Фракцій немає");
            return false;
        }
    }

    private Faction getFaction(String name) {
        Optional<Faction> optionalFaction = listOfFactions.stream().filter(x -> x.getName()
                .equalsIgnoreCase(name))
                .findFirst();

        if (optionalFaction.isPresent()) {
            return optionalFaction.get();
        } else {
            System.out.println("Фракцію " + name + " не знайдено");
            return null;
        }
    }


}
