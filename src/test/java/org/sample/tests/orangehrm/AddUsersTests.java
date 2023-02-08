package org.sample.tests.orangehrm;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.JsonReader;
import one.util.streamex.StreamEx;
import org.sample.designpattern.orangehrm.pages.OrangeHRM;
import org.sample.tests.orangehrm.data.AddUser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.github.sskorol.data.TestDataReader.use;

public class AddUsersTests {
    OrangeHRM orangeHRM;

    @BeforeClass
    public void setUp() {
        orangeHRM = new OrangeHRM();
    }

    @Test(dataProvider = "userData")
    public void addUser(AddUser user) {
        orangeHRM
                .openApplication("https://opensource-demo.orangehrmlive.com/")
                .hasItLoaded()
                .loginAs("Admin", "admin123")
                .hasItLoaded()
                .openAdmin()
                .hasItLoaded()
                .addUsers()
                .hasItLoaded()
                .fill(user.getEmployeeName(), user.getUserName(), user.getPassword())
                .setRoleAs(user.getUserRole())
                .setStatusAs(user.getStatus())
                .goToDashboard()
                .hasItLoaded()
                .logOut()
                .hasItLoaded();
    }

    @DataSupplier
    public StreamEx<AddUser> userData() {
        return use(JsonReader.class)
                .withTarget(AddUser.class)
                .withSource("testdata/add_user.json")
                .read();
    }
}