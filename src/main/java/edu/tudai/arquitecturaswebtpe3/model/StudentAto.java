package edu.tudai.arquitecturaswebtpe3.model;

import com.sun.istack.NotNull;
import edu.tudai.arquitecturaswebtpe3.domain.entity.Gender;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"id", "givenNames", "lastName"})
@Builder
@EqualsAndHashCode
public class StudentAto {

    private Long id;

    @NotNull
    private String givenNames;

    @NotNull
    private String lastName;

    @NotNull
    private LocalDate dateOfBirth;

    @NotNull
    private Gender gender;

    @NotNull
    private String dni;

    @NotNull
    private String city;

    @NotNull
    private Long studentId;
}


