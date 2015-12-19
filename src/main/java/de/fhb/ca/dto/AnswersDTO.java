package de.fhb.ca.dto;

import java.util.List;

import de.fhb.ca.dto.util.AnswerDTO;
import de.fhb.ca.dto.util.MultibleChoiceAnswerDTO;
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
    private List<AnswerDTO> answers;
    @NonNull
    private List<MultibleChoiceAnswerDTO> mcAnswers;
    @NonNull
    private String deviceID;
}
