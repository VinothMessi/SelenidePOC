package org.sample.tests.orangehrm.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddUser {
    private String userRole;
    private String status;
    private String employeeName;
    private String userName;
    private String password;
}