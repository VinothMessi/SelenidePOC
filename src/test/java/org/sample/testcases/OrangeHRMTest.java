package org.sample.testcases;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.JsonReader;
import one.util.streamex.StreamEx;
import org.sample.designpattern.orangehrm.pages.OrangeHRM;
import org.sample.testcases.testdata.AddEmployee;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.github.sskorol.data.TestDataReader.use;

public class OrangeHRMTest {
    OrangeHRM orangeHRM;

    @BeforeClass
    public void setUp() {
        orangeHRM = new OrangeHRM();
    }

    @Test(dataProvider = "getTestData")
    public void addEmployee(AddEmployee employee) {
        orangeHRM
                .openApplication("https://opensource-demo.orangehrmlive.com/")
                .hasItLoaded()
                .loginAs("Admin", "admin123")
                .hasItLoaded()
                .openPIM()
                .hasItLoaded()
                .addEmployee()
                .hasItLoaded()
                .set(employee.getFirstName(), employee.getLastName(), employee.getLastName())
                .set(employee.getUserName(), employee.getPassword())
                /*.save()*/
                .goToDashboard()
                .hasItLoaded()
                .logOut()
                .hasItLoaded();
    }

    @DataSupplier
    public StreamEx<AddEmployee> getTestData() {
        return use(JsonReader.class)
                .withTarget(AddEmployee.class)
                .withSource("testdata/add_employee.json")
                .read();
    }
}