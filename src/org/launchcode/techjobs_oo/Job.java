package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() { //Added
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType position, CoreCompetency cc){ //Added
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = position;
        this.coreCompetency = cc;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Add to string method

    @Override
    public String toString() {

       // return "    ";
        String idPrint = String.valueOf(this.getId());
        if(idPrint == null){
            idPrint = "Data not available";
        }


        String namePrint = this.name;
        if(this.name == null){
            namePrint = "Data not available";
        }

        //Employer
       String employerPrint = "";
        if(this.employer.getValue() == ""){
            employerPrint = "Data not available";
        }

        else  employerPrint = this.employer.getValue();

        //Location
        String locationPrint = " ";
        if(this.location.getValue() == ""){
            locationPrint = "Data not available";
        }

        else locationPrint = this.location.getValue();

        //PositionType
        String positionTypePrint = " ";
        if(this.positionType.getValue() == ""){
            positionTypePrint = "Data not available";
        }

        else positionTypePrint = this.positionType.getValue();

        //Core Competency

        String coreCompetencyPrint = " ";
        if(this.coreCompetency.getValue() == ""){
            coreCompetencyPrint = "Data not available";
        }

        else coreCompetencyPrint = this.coreCompetency.getValue();



        return " \nID: "+ idPrint + "\n" +
                "Name: " + namePrint + "\n" +
                "Employer: " + employerPrint + "\n" +
                "Location: " + locationPrint + "\n" +
                "Position Type: " + positionTypePrint + "\n" +
                "Core Competency: " + coreCompetencyPrint + "\n ";

//        return " \nID: "+ id + "\n" +
//                "Name: " + this.name + "\n" +
//                "Employer: " + this.employer + "\n" +
//                "Location: " + this.location + "\n" +
//                "Position Type: " + this.positionType + "\n" +
//                "Core Competency: " + this.coreCompetency + "\n ";


    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


}
