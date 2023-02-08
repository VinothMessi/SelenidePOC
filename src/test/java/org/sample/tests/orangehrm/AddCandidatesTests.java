package org.sample.tests.orangehrm;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.JsonReader;
import one.util.streamex.StreamEx;
import org.sample.designpattern.orangehrm.pages.OrangeHRM;
import org.sample.tests.orangehrm.data.AddCandidate;
import org.sample.tests.orangehrm.data.AddEmployee;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.github.sskorol.data.TestDataReader.use;

public class AddCandidatesTests {
    OrangeHRM orangeHRM;

    @BeforeClass
    public void setUp() {
        orangeHRM = new OrangeHRM();
    }

    @Test(dataProvider = "candidateData")
    public void addCandidate(AddCandidate candidate) {
        orangeHRM
                .openApplication("https://opensource-demo.orangehrmlive.com/")
                .hasItLoaded()
                .loginAs("Admin", "admin123")
                .hasItLoaded()
                .openRecruitment()
                .hasItLoaded()
                .addCandidate()
                .hasItLoaded()
                .fill(candidate.getFirstName(), candidate.getMiddleName(), candidate.getLastName())
                .setVacancy(candidate.getRole())
                .fill(candidate.getEmail(), candidate.getNumber())
                .uploadResume(candidate.getFile())
                .set(candidate.getKeywords(), candidate.getDate())
                .type(candidate.getNotes())
                .goToDashboard()
                .hasItLoaded()
                .logOut()
                .hasItLoaded();
    }

    @DataSupplier
    public StreamEx<AddCandidate> candidateData() {
        return use(JsonReader.class)
                .withTarget(AddCandidate.class)
                .withSource("testdata/add_candidate.json")
                .read();
    }
}