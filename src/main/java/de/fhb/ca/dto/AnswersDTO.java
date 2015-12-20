package de.fhb.ca.dto;

import java.util.List;

import de.fhb.ca.dto.util.TextAnswerDTO;
import de.fhb.ca.dto.util.MultipleChoiceAnswerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnswersDTO {
    @NonNull
    private String voteToken;
    @NonNull
    private String studyPath;
    @NonNull
    private List<TextAnswerDTO> textAnswers;
    @NonNull
    private List<MultipleChoiceAnswerDTO> mcAnswers;
    @NonNull
    private String deviceID;
}
