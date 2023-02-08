package org.sample.tests.orangehrm.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCandidate {
    private String firstName;
    private String middleName;
    private String lastName;
    private String role;
    private String email;
    private String number;
    private String file;
    private String keywords;
    private String date;
    private String notes;
}