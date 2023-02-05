package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        String spec = "Returns that two job objects have different id values.";
        assertNotEquals(spec, jobOne.getId(), jobTwo.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job fullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", fullJob.getName());
        assertEquals("ACME", fullJob.getEmployer().getValue());
        assertEquals("Desert", fullJob.getLocation().getValue());
        assertEquals("Quality control", fullJob.getPositionType().getValue());
        assertEquals("Persistence", fullJob.getCoreCompetency().getValue());
        assertTrue(fullJob.getName() instanceof String);
        assertTrue(fullJob.getEmployer() instanceof Employer);
        assertTrue(fullJob.getLocation() instanceof Location);
        assertTrue(fullJob.getPositionType() instanceof PositionType);
        assertTrue(fullJob.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality() {
        Job fullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job fullJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(fullJob.equals(fullJob2));
    }

}
