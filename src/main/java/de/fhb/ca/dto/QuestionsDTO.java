package de.fhb.ca.dto;

import java.util.List;

import de.fhb.ca.dto.util.TextQuestionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsDTO {
    @NonNull
    private List<String> studyPaths;
    @NonNull
    private List<TextQuestionDTO> textQuestions;
    @NonNull
    private List<MultipleChoiceQuestionDTO> multipleChoiceQuestionDTOs;
}
