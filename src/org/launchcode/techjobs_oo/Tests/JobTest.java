package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import java.lang.*;





public class JobTest {

    Job test_job1;
    Job test_job2;


    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
    }

    //Test the Empty Constructor
    @Test
    public void testSettingJobId(){
        assertFalse(test_job1.getId() == test_job2.getId());
        assertTrue(Math.abs(test_job2.getId() - test_job1.getId()) == 1);
    }

    //Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test_job3.getName(), "Product tester");
        assertEquals(test_job3.getLocation().toString(), "Desert");
        assertEquals(test_job3.getPositionType().toString(),"Quality control");
        assertEquals(test_job3.getCoreCompetency().toString(), "Persistence");
        assertEquals(test_job3.getEmployer().toString(), "ACME"); // Problem child
    }

    //Test the equals Method
    @Test
    public void testJobsForEquality(){
        Job test_job4 = new Job("Web Developer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5 = new Job("Web Developer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job4.equals(test_job5));
    }

    @Test
    public void passFirstTest(){
        Job test_job6 = new Job("Web Developer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job6.toString().startsWith(" "));
        assertTrue(test_job6.toString().endsWith(" "));
    }

    @Test
    public void passSecondTest(){
        Job test_job7 = new Job("Web Developer", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int testJob7ID = test_job7.getId();
        assertEquals(" \nID: "+ testJob7ID + "\n" +
                "Name: " + "Web Developer" + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + "Desert" + "\n" +
                "Position Type: " + "Quality control" + "\n" +
                "Core Competency: " + "Persistence" + "\n ", test_job7.toString());

    }

    @Test
    public void passThirdTest(){

        Job test_job8 = new Job("Web Developer", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int testJob8ID = test_job8.getId();
        assertEquals(" \nID: "+ testJob8ID + "\n" +
                "Name: " + "Web Developer" + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position Type: " + "Quality control" + "\n" +
                "Core Competency: " + "Persistence" + "\n ", test_job8.toString());

    }


}

