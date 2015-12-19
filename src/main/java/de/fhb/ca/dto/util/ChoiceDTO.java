package de.fhb.ca.dto.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Admin on 07.12.2015.
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ChoiceDTO implements Serializable{

    private String text;
    private short grade;

    @Deprecated // this method don't belong in a dto
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(text);
        out.writeInt(grade);
    }

    @Deprecated // this method don't belong in a dto
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        text = in.readUTF();
        grade = (short) in.readInt();
    }


}
