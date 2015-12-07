package de.fhb.ca.dto;

import java.util.Map;

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
    private Map<String, String> answers;
    @NonNull
    private String deviceID;
}
