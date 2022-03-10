package com.loki.todo.model;

public class ToDos {

    private String titletodo;
    private String destodo;
    private String datetodo;

    public ToDos() {

    }

    public ToDos(String titletodo, String destodo, String datetodo) {
        this.titletodo = titletodo;
        this.destodo = destodo;
        this.datetodo = datetodo;
    }

    public String getTitletodo() {
        return titletodo;
    }

    public void setTitletodo(String titletodo) {
        this.titletodo = titletodo;
    }

    public String getDestodo() {
        return destodo;
    }

    public void setDestodo(String destodo) {
        this.destodo = destodo;
    }

    public String getDatetodo() {
        return datetodo;
    }

    public void setDatetodo(String datetodo) {
        this.datetodo = datetodo;
    }
}
