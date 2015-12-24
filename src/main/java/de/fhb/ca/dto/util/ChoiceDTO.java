package de.fhb.ca.dto.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ChoiceDTO implements Serializable {
    @NonNull
    private String choiceText;
    @NonNull
    private short grade;

    @Deprecated // this method don't belong in a dto
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(choiceText);
        out.writeInt(grade);
    }

    @Deprecated // this method don't belong in a dto
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        choiceText = in.readUTF();
        grade = (short) in.readInt();
    }


}
