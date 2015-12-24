package de.fhb.ca.dto.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultipleChoiceAnswerDTO {
    @NonNull
    private String questionText;
    @NonNull
    private ChoiceDTO choice;
}
