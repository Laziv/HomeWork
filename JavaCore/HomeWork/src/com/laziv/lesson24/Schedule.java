package com.laziv.lesson24;


import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seances = new TreeSet<>();


    public void addSeance(Seance seance) {
        seances.add(seance);
    }

    public void removeSeance(Time startTime) {
        Optional<Seance> optionalSeance = seances.stream().filter(s -> s.getStartTime().equals(startTime)).findFirst();
        if (optionalSeance.isPresent()) {
            seances.remove(optionalSeance.get());
            System.out.println("Сеанс видалено");
        } else {
            System.out.println("Сеансу с таким початком часу не існує");
        }
    }

    public Set<Seance> getSeances() {
        return seances;
    }
}
