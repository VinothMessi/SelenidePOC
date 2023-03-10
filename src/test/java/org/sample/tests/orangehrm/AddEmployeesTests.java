package org.sample.tests.orangehrm;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.JsonReader;
import one.util.streamex.StreamEx;
import org.sample.designpattern.orangehrm.pages.OrangeHRM;
import org.sample.tests.orangehrm.data.AddEmployee;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.github.sskorol.data.TestDataReader.use;

public class AddEmployeesTests {
    OrangeHRM orangeHRM;

    @BeforeClass
    public void setUp() {
        orangeHRM = new OrangeHRM();
    }

    @Test(dataProvider = "employeeData")
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
                .goToDashboard()
                .hasItLoaded()
                .logOut()
                .hasItLoaded();
    }

    @DataSupplier
    public StreamEx<AddEmployee> employeeData() {
        return use(JsonReader.class)
                .withTarget(AddEmployee.class)
                .withSource("testdata/add_employee.json")
                .read();
    }
}