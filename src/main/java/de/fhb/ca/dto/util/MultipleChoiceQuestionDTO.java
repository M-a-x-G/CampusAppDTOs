package de.fhb.ca.dto.util;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultipleChoiceQuestionDTO {
    private String text;
    private List<ChoiceDTO> choices;
}
