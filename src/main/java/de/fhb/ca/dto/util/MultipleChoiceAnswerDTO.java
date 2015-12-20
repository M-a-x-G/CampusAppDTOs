package de.fhb.ca.dto.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultipleChoiceAnswerDTO {
    private String questionText;
    private ChoiceDTO choice;
}
