package de.fhb.ca.dto.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultibleChoiceAnswerDTO {
    private String text;
    private ChoiceDTO choice;
}
