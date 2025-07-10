package com.estudo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Pessoa {

    private String name;
    private LocalDate birth;

    public Pessoa(String name, LocalDate birth){
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(birth, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return name.equals(pessoa.name) && Objects.equals(birth, pessoa.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birth);
    }
}
