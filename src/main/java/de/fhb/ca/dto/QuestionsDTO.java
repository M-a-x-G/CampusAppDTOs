package de.fhb.ca.dto;

import java.util.List;

import de.fhb.caeb.dto.util.MultipleChoiceQuestion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsDTO {
    private String token;
    private List<String> textQuestions;
    private List<MultipleChoiceQuestion> multipleChoiceQuestions;
}
