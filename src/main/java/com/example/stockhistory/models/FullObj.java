package com.example.stockhistory.models;

public class FullObj {

    private Datatable datatable ;

    public FullObj() {
    }

    public FullObj(Datatable datatable) {
        this.datatable = datatable;
    }

    public Datatable getDatatable() {
        return datatable;
    }

    public void setDatatable(Datatable datatable) {
        this.datatable = datatable;
    }

    @Override
    public String toString() {
        return "FullObj{" +
                "datatable=" + datatable +
                '}';
    }
}
