package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

        private int id;
        private static int nextId = 1;
        private String value;

        public JobField() {
            id = nextId;
            nextId++;
        }

        public JobField(String value) {
            this();
            this.value = value;
        }


        // Methods

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
