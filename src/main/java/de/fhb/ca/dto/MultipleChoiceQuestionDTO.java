package de.fhb.ca.dto;

import java.util.List;

import de.fhb.ca.dto.util.ChoiceDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultipleChoiceQuestionDTO {
    private String question;
    private List<ChoiceDTO> choices;
}
