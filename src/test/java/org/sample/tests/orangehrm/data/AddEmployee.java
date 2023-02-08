package org.sample.tests.orangehrm.data;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddEmployee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String userName;
    private String password;
}